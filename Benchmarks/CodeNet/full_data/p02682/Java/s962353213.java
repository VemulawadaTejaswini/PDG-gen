import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();	//1が書かれたカードの枚数
		int B = in.nextInt();	//0が書かれたカードの枚数
		int C = in.nextInt();	//-1が書かれたカードの枚数
		int K = in.nextInt();	//取る枚数
		int max = 0;			//最大値
 
		if(K<=A){			//取る枚数がA以下ならば
			max += K;
		}else{
          	max += A;
			K-=A;
          	if((K-B) >= 0){			//取る枚数がB以上ならば
				K-=B;
                if(K > 0){				//取る枚数が1以上ならば
					max -= K;
				}
			}
		}
		System.out.println(max);
	}
}