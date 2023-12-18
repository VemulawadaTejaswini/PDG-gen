import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    String s[] = new String[N];
    
    sc.nextLine();
    for(int i=0; i<N; i++){
    	s[i] = sc.nextLine();
    }
    
    int numStr = 10;
    long sumCnt = 0;
    for(int i=0; i<N-1; i++){
      String[] str_si = s[i].split("");
      for(int j=i+1; j<N; j++){
        String[] str_sj = s[j].split("");
        int cnt=0;
        for(int k_i=0; k_i<numStr; k_i++){
          for(int k_j=0; k_j<numStr; k_j++){
            if(str_si[k_i].equals(str_sj[k_j])){
              cnt++;
              str_sj[k_j] = "";
              break;
            }
          }
          if(cnt == 10)
            sumCnt++;
          if((k_i+1) != cnt)
            break;
        }
      }
    }
    System.out.println(sumCnt);
  }
}