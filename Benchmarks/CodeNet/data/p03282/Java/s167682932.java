package beginner106;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//C
		//5000兆 = 10^15 * 5
		String S = sc.next();
		long K = sc.nextInt();
		String tmp = "1";
		for(int i = 0 ; i< K ; i++){
			if(S.charAt(i) != '1'){
				tmp = S.substring(i,i+1);
				break;
			}
		}
		System.out.println(tmp);
	}
}