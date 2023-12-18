import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long S = sc.nextLong();
		int[] array = {};
		if(S<=1000000000) {
			System.out.println(0+" "+0+" "+0+" "+1+" "+S+" "+0);
		}else {
			for(long i=2;i<=S;i++) {
				if(S%i==0 && S/i<=1000000000) {
					System.out.println(0+" "+0+" "+0+" "+i+" "+S/i+" "+0);
					break;
				}
			}
		}
	}
}
