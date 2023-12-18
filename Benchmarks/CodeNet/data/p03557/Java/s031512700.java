import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      int[] A=new int[N];
      int[] B=new int[N];
      int[] C=new int[N];
      for(int i=0;i<N;i++){
      	A[i]=sc.nextInt();
      }
      for(int i=0;i<N;i++){
      	B[i]=sc.nextInt();
      }
      for(int i=0;i<N;i++){
      	C[i]=sc.nextInt();
      }
      int x=0;
      Arrays.sort(A);
      Arrays.sort(B);
      Arrays.sort(C);
      for(int i=0;i<N;i++){
      	for(int m=0;m<N;m++){
        	if(A[i]<B[m]){
            	for(int l=0;l<N;l++){
                	if(B[m]<C[l]){
                    	x++;
                    }
                }
            }
        }
      }
      System.out.println(x);
	}
}