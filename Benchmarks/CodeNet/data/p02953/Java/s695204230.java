import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();

		boolean can = true;
		boolean before = false;
		int b = 0;
		for(int i =0;i < N;i++) {
			int H = scn.nextInt();
			if(b - H > 1) {
				can = false;
				break;
			}else if(b - H == 1){
				if(before) {
					can = false;
					break;
				}else {
					before = true;
				}
			}else {
				if(b - H == 0) {

				}else {
					before = false;
				}
			}
			b = H;
		}
		System.out.println(can?"Yes":"No");
	}

}