import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[]=new int[N];//競技コスト
		int B[]=new int[M];//審査基準
		int kyougi[]=new int[N];//入った票数を管理する。
		int top=0,max=0;
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++){
			B[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				if(A[j]<=B[i]){//審査基準より費用が小さい競技
					kyougi[j]++;
					if(max<kyougi[j]){
						max=kyougi[j];
						top =j+1;
					}
					break;
				}
			}
		}
		System.out.println(top);
		}
}