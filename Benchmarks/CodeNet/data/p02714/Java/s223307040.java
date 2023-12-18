import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int cnt = 0;
    int tmp1 = 0;
    int tmp2 = 0;
    
    for(int i=1;i<N-1;i++) {
      for(int j=i+1;j<N;j++) {
        for(int k=j+1;k<N+1;k++) {
          tmp1 = j-i;
          tmp2 = k-j;
          if(!(get_str(S,i).equals(get_str(S,j))) && !(get_str(S,i).equals(get_str(S,k))) && !(get_str(S,j).equals(get_str(S,k))) && tmp1 != tmp2) {
            cnt += 1;
          }
        }
      }
    }
    System.out.println(cnt);
  }
  public static String get_str(String S, int idx) {
    return S.substring(idx-1, idx);
  }
}  