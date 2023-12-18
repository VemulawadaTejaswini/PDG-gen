import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	//1が書かれたカードの枚数
		int B = in.nextInt();	//0が書かれたカードの枚数
		int C = in.nextInt();	//-1が書かれたカードの枚数
		int K = in.nextInt();	//取る枚数
		int max = 0;			//最大値
 
		if((K-A) >= 0){
			max += 1*A;
			K-=A;
		}else{
			max += 1*K;
		}
 		if((K-B) >= 0){
			K-=B;
		}
		max -= 1*K;
 
		System.out.println(max);
	}
}