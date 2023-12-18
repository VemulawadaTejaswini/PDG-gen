import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<HashMap<Integer, Integer>> issues = 
      new ArrayList<HashMap<Integer, Integer>>();
    int n= sc.nextInt();
    for (int i=0; i<n; i++) {
      HashMap<Integer, Integer> someoneIssue = new HashMap<Integer, Integer>();
      int issueCnt = sc.nextInt();
      for (int j=0; j<issueCnt; j++) {
        int x = sc.nextInt()-1;
        int a = sc.nextInt();
        someoneIssue.put(x, a);
      }
      issues.add(someoneIssue);
    }
    
    int max = 0;
    int doubtChk = 0;
    for (int i=0 ; i<(1<<n); i++) {
      int bitCount = 0;      
      for (int j=0; j<n; j++) {
        if ((1&i>>j)==1) {
          bitCount ++;
          HashMap<Integer, Integer> jsIssue = issues.get(j);
          if (jsIssue.size()>0) {
            for (Integer bitNum : jsIssue.keySet()) {

              if (chkIssue(i, bitNum, jsIssue.get(bitNum))) {
                
              }
              else {
                doubtChk = 1;
              }
            }
          }
        }
      }
      if (doubtChk==0) {
        if (max<bitCount) {
          max = bitCount;
        }
      }
      else {
        doubtChk = 0;
      }
      bitCount = 0;
    }
    
    System.out.println(max);
    
  }
  
  public static boolean chkIssue(int object, int bitNum, int bit) {
    if (bit == 1 ) {
      if ((1&(object>>bitNum))==1) {
        return true;
      }
      return false;
    }
    else {
      if ((1&(object>>bitNum))==0) {
        return true;
      }
    }
    return false;
    
  }
}
