import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int tmp = -1;
		String result="No";
		scan.close();

		for(int i = 1;i<=X;i++) {
			tmp = 2*i + 4*(X-i);
			if(Y==tmp) {
				result = "Yes";
			}
		}
		System.out.println(result);
	}

}