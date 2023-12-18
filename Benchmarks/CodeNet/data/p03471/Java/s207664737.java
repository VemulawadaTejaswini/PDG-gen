import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = Integer.parseInt(scn.next());
		int total = Integer.parseInt(scn.next());
		int nowMoney = 0;
		boolean isSuccess = false;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				for (int t = 0; t < count ; t++) {
					nowMoney = (i * 10000)+(j * 5000)+(t * 1000);
					if(isSuccess) {
						break;
					}
					else if(nowMoney==total) {
						if(i+j+t==count) {
							System.out.println(i + " " + j + " " + t  );
							isSuccess = true;
							break;
						}
					}

				}
			}
		}
		if(!isSuccess) {
			System.out.println("-1 -1 -1");
		}

	}

}

