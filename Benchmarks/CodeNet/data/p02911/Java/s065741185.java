import java.util.*; 
 
public class Main{
  
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);     
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] a = new int[Q];
    
    for (int i = 0 ; i < Q ; i++) {
      a[i] = sc.nextInt();
    }//num of answer
    int[] b = new int[N];
    for (int i = 0 ; i < Q ; i++) {
      b[a[i]]++;
    }//
    for (int i = 0 ; i < N ; i++) {
      if(K - Q + b[i] > 0){
      System.out.println("Yes");
      }else { 
        System.out.println("No");
      }
    }
  }
}