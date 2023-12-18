import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int sum = 700;
			int t = 100;;
			String a = "o";
			for(int i = 0; i < 3; i++) {
			String S = sc.next();
			if(S.contentEquals(a)) {
			sum = sum + t;}}
			System.out.println(sum);
			}
			}