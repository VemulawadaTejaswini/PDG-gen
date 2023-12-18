import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A =new int[N+10];
		A[0] =0;
		for(int i =1;i<=N;i++){
			A[i]=sc.nextInt();
		}
		int cost=0;
		int[] inf = new int[N+10];
		for(int i =0;i<=N;i++){
			int div = A[i+1]-A[i];
			inf[i] =div;
			cost+=Math.abs(div);
		}
		
		for(int i =0;i<N;i++){
			int p = Math.abs(inf[i]);
			int q = Math.abs(inf[i+1]);
			if(inf[i]*inf[i+1]>=0){
				System.out.println(cost);
			}else{
				System.out.println(cost-((p+q)-Math.abs(p-q)));
			}
		}
 		sc.close();
	}
}
