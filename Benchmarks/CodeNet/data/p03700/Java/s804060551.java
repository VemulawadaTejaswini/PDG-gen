import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	int N,A,B;
	int []h;
	void solve(){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		A=sc.nextInt();
		B=sc.nextInt();
		h=new int[N];
		long suma=A+B*(N-1);
		long sumh=0;
		
		for(int i=0;i<N;i++){
			h[i]=sc.nextInt();
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
