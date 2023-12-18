import java.util.Scanner;
 
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    String A[] = new String[N];
    
    for(int i=0; i<N; i++){
      A[i]=sc.next();
    }
    
    String B[] = new String[M];
    
    for(int i=0; i<M; i++){
      B[i]=sc.next();
    }
    
    String ans = "No";
    
    for(int i=0; i<=N-M+1; i++){
      
      for(int j=0; j<=N-M+1;j++){
        //System.out.println(A[i].substring(j));
        //一文字ずつ確認
        if(A[i].substring(j).startsWith(B[0])){
          ans = "Yes";
          
          //下の行も確認
          for (int k = 0; k < M-1; k++) {
            //System.out.println(A[i + k].substring(j));
            //System.out.println(B[k]);
            if (!A[i + k].substring(j).startsWith(B[k])) {
              ans = "No";
            }
          }
          if(ans.equals("Yes")){
            break;
          }
        }
      }
    }
    System.out.println(ans);
    
  }
}
    
    