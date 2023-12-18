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
		 boolean no=false;
		 int N=sc.nextInt();
		 int M=sc.nextInt();
		 int[] a=new int[M];
		 long res=0;
		 long sum=1;
		 for(int i=0;i<M;i++) {
			 a[i]=sc.nextInt();
			 if(i==0) {
				 sum*=fib(a[i]-1);
		//		 System.out.println(i+" 1 ");
				 if(M==1) {
					 sum*=N-a[i]-1;
				 }
			 }else if(i==M-1){
				 sum*=fib(N-a[i]-1);
		//		 System.out.println(i+" N ");
			 }else {
				 sum*=fib(a[i]-a[i-1]-2);
			//	 System.out.println(i+" other ");
			 }
			 if(sum==0) {
				 sum=1;
			 }
		 }

		 for(int i=0;i<M-1;i++) {
			 if(a[i]==a[i+1]-1) {
				 no=true;
				 i=M;
				 System.out.println(no);
			 }
		 }
		 if(no==false) {
			 res=sum;
		 }


		 System.out.println(res%1000000007);
	 }






	 }