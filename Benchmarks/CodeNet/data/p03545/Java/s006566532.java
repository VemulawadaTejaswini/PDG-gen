import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x[] = new int[4];
		for(int i=0; i<4; i++){
			x[i] = n % 10;
			n = n / 10;
		}

		
		if ((x[3] + x[2] + x[1] + x[0]) == 7){
			System.out.println(x[3]+"+"+x[2]+"+"+x[1]+"+"+x[0]+"=7");
		}
		else if ((x[3] + x[2] + x[1] - x[0]) == 7){
			System.out.println(x[3]+"+"+x[2]+"+"+x[1]+"-"+x[0]+"=7");
		}
		else if ((x[3] + x[2] - x[1] + x[0]) == 7){
			System.out.println(x[3]+"+"+x[2]+"-"+x[1]+"+"+x[0]+"=7");
		}
		else if ((x[3] - x[2] + x[1] + x[0]) == 7){
			System.out.println(x[3]+"-"+x[2]+"+"+x[1]+"+"+x[0]+"=7");
		}
		else if ((x[3] + x[2] - x[1] - x[0]) == 7){
			System.out.println(x[3]+"+"+x[2]+"-"+x[1]+"-"+x[0]+"=7");
		}
		else if ((x[3] - x[2] - x[1] + x[0]) == 7){
			System.out.println(x[3]+"-"+x[2]+"-"+x[1]+"+"+x[0]+"=7");
		}
		else if ((x[3] - x[2] + x[1] - x[0]) == 7){
			System.out.println(x[3]+"-"+x[2]+"+"+x[1]+"-"+x[0]+"=7");
		}
		else if ((x[3] - x[2] - x[1] - x[0]) == 7){
			System.out.println(x[3]+"-"+x[2]+"-"+x[1]+"-"+x[0]+"=7");
		}
	}

}
