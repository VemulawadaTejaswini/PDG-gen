import java.util.Scanner;

public class Main {
	/*
	*1 軒のホテルがあります。 このホテルの宿泊費は、次のようになっています。
	*
	*最初の K 泊までは、1 泊あたり X 円
	*K+1 泊目以降は、1 泊あたり Y 円
	*高橋君は、このホテルに N 泊連続で宿泊することにしました。
	* 高橋君の宿泊費は合計で何円になるか求めてください。
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int result=0;
		for(int i=0;i<N;i++){
			if(i<K){
				result=result+X;
			}else{
				result=result+Y;
			}
		}
		System.out.println(result);
	}

}