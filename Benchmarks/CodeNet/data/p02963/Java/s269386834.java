import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long S = sc.nextLong();

		if(S<=1000000000) {
			System.out.println(0+" "+0+" "+0+" "+1+" "+S+" "+0);
		}else{
			int a =String.valueOf(S).length()-10;
			for(long i=0+(long)(Math.pow(10, a));i<=1000000000;i++) {
				if(S%i==0 && S/i<=1000000000) {
					System.out.println(0+" "+0+" "+0+" "+i+" "+S/i+" "+0);
					break;
				}
			}
		}
	}
}
