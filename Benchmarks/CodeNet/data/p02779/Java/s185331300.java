import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    boolean hantei = true;
    for(int i=0; i<N; i++){
      A[i] = sc.nextLong();
      for(int j=0; j<i; j++){
      	if(A[i] == A[j]){
        	hantei = false;
            break;
        }	
      }
      if(hantei == false) break;
    }
    if(hantei == true) System.out.println("YES");
    else System.out.println("NO");
  }
}
