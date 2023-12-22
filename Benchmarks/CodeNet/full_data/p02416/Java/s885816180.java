import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] n;
		int sum=0;
		while(true) {
			n = sc.nextLine().split("");
			if(n[0].equals("0")) break;
			sum=0;
			for(int i=0;i<n.length;i++) {
				sum += Integer.parseInt(n[i]);
			}
			System.out.println(sum);
		}

		
		sc.close();

	}

}
