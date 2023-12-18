import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String [] inArray = in.split(" ");
		int [] ansArray = new int[3];
		ansArray[0] = Integer.parseInt(inArray[0]);
		ansArray[1] = Integer.parseInt(inArray[1]);
		ansArray[2] = Integer.parseInt(inArray[2]);

		int ans = ansArray[0];

		for (int i = 0 ; i < ansArray.length; i++) {
			if (ans > ansArray[i]){
				ans = ansArray[i];
			}
		}

		System.out.println(ans);
		sc.close();
	}



}
