import java.util.Scanner;
public class Main{

	static int []a;
	static int []b;
	static int ans;
	static int count;
	public static void main(String[] args) {
		boolean b = false;
		a = new int [4];
		Scanner sc =  new Scanner(System.in);		//入s力
		int n = sc.nextInt();				//入力したのをint型に変換
		for(int i = 0;i<4;i++){
			int m = 1;
			for(int j = 3-i;j >0; j--){
				m *= 10;
			}
			a[i] = n/m;
			n -= (n/m)*m;
			
		}			//四つの数字をaに入れる
		int A = a[0];
		int B = a[1];
		int C = a[2];
		int D = a[3];
		
		for(int i = 0;i < 8;i++){
			switch (i) {
			case 0:
				if(A+B +C+D == 7)
					System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
				break;
			case 1:
				if(A-B+C+D == 7)
					System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
				break;
			case 2:
				if(A+B-C+D == 7)
					System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
				break;
			case 3:
				if(A+B+C-D == 7)
					System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
				break;
			case 4:
				if(A-B-C+D == 7)
					System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
				break;
			case 5:
				if(A-B+C-D == 7)
					System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
				break;
			case 6:
				if(A+B-C-D == 7)
					System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
				break;
			case 7:
				if(A-B-C-D == 7)
					System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
				break;
				

			default:
				break;
			}
		}
		

	}



}
