import java.util.Scanner;

public class Main {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 0;
		    if(a <= 12 && b <= 31) {
			for(int i = 1;i <= a; i++) {
			for(int j = 1;j <= b; j++) {
				if(i == j) {c++;
			}}}
			System.out.println(c);
			}}}