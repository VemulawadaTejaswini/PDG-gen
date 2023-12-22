import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int A[]=new int[N];//競技コスト
		int B[]=new int[M];//審査基準
		int kyougi[]=new int[N];//入った票数を管理する。
		int top;
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		for(int i=0;i<M;i++){
			B[i]=sc.nextInt();
		}
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				int max=N;//審査員が選んだ最も面白い競技の番号  初期は最下位のN
				if(B[i]>=A[j]){//審査基準より費用が小さい競技
					int count=0;
					if(count==0){//最初の競技番号
					max=j;
					count++;
					}
				kyougi[max]+=1;	
				}
			}
		}
		top=kyougi[0];//topは最多票数の競技番号
		for(int i=0;i<N;i++){
			if(kyougi[top]<kyougi[i]){
				top=i;
			}
		}
		System.out.println(top);
	}

}