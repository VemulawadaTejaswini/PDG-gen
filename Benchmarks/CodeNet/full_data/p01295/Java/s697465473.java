import java.util.Scanner;

//Champernowne Constant
public class Main{

	void run(){
		int S = 125000;
		int[] a = new int[S];
		int s = 0;
		for(int i=0;i<S;i++){
			a[i] = s;
			int L = 1000*i, R = L+999;
			if((L+"").length()==(R+"").length())s+=1000*(L+"").length();
			else{
				for(int k=L;k<=R;k++)s+=(k+"").length();
			}
		}
		Scanner sc = new Scanner(System.in);
		for(;;){
			int N = sc.nextInt(), K = sc.nextInt();
			if((N|K)==0)break;
			int id = 0;
			for(int i=0;i+1<S;i++){
				if(a[i]<=N&&N<a[i+1]){
					id = i; break;
				}
			}
			N-=a[id];
			StringBuilder sb = new StringBuilder();
			for(int k=1000*id;k<1000*id+1000;k++)sb.append(k);
			if(sb.length()<N+K)for(int k=1001*id;k<1001*id+1000;k++)sb.append(k);
			System.out.println(sb.substring(N, N+K));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}