import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextInt();
			double b = sc.nextInt();
			int n = sc.nextInt();
			String tmp = String.valueOf(a/b);
			int p = tmp.indexOf(".");
			int sum = 0;
			for(int i = 1; i < n+1; i++){
				int c = tmp.charAt(p+i)-'0';
				sum += c;
			}
			System.out.println(sum);
		}
	}
}