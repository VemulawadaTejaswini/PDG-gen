import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		while (sc.hasNext()) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			int n = sc.nextInt();

			Double c = a / b;

			int kei = 0;
			//Integer kei2 =0;


			long ans = 0;

			for (int i = 1; i <= n; i++) {
				kei = (int)(c * (Math.pow(10, i)))%10;
				//kei2=raund(kei)%10;
				ans = ans + kei;
			}
			System.out.println(ans);
		}

	}

	public static String raund(String kei){
		//String str =String.valueOf(kei);
		String [] st =kei.split("\\.");
		//String [] st2 = st[0].split("");
		//String num = Integer.parseInt(st[0]);
		return st[0];
		//System.out.println(str);

	}

}