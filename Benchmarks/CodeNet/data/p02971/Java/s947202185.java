import java.util.Arrays;
//Java8(OpenJDK 1.8.0)
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Solve s= new Solve();
		s.solve();
	}

}
class Solve{
	 Scanner sc = new Scanner(System.in) ;
	 void solve() {
		
		 int N =sc.nextInt();
		 int[] A = new int[N];
		 int[] A_sort = new int[N];
		 
		 for(int i = 0;i<N;i++) {
			 int temp = sc.nextInt();
			 A[i] = temp;
			 A_sort[i] = temp;
		 }
		 
		 Arrays.sort(A_sort);
		 
		 for(int i = 0; i<N;i++) {
			 boolean jufuku = false;
			 
			 for(int j=N-1;j>=0;j--) {
				 if(A[i]!=A_sort[j]) {
					 System.out.println(A_sort[j]);
					 break;
				 }else if(A[i]==A_sort[j]&&jufuku==true){
					 System.out.println(A_sort[j]);
					 break;
				 }else {
					 jufuku = true;
				 }
			 }
		 }
	 }
}