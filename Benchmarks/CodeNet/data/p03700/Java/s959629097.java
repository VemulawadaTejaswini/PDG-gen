import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int N;
	long A,B;
	long []h;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=sc.nextLong();
		B=sc.nextLong();
		h=new long[N];
		long suma=A+B*(N-1);
		long sumh=0;
		
		for(int i=0;i<N;i++){
			h[i]=sc.nextLong();
			sumh+=h[i];
		}
		
		if(A/2<=B){
			if(sumh%suma==0){
				System.out.println(sumh/suma);
			}else{
				System.out.println(sumh/suma+1);
			}
		}else{
			if(sumh%suma==0){
				System.out.println(sumh/suma+1);
			}else{
				System.out.println(sumh/suma+2);
			}
		}
		
	}
}