import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextInt();
			double b = sc.nextInt();
			int n = sc.nextInt();
			String str = Double.toString(a/b);
			String[] stra = str.split("\\.");
			str = stra[1] + "000000000";
			str = str.substring(0,n);
			String[] strb = str.split("");
			int sum = 0 ;
			for(int i = 0; i < strb.length ; i++){
				sum += Integer.parseInt(strb[i]);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}