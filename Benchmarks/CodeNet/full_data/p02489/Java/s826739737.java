import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num[] = new int[1000];
		int i;
		int temp;

		Scanner scan;

		for(i=0;;i++){
			scan = new Scanner(System.in);
			temp = scan.nextInt();

			if(temp == 0){
				break;
			}
			num[i] = temp;
		}

		for(int j=0;j<i;j++){
			System.out.println("Case " + (j+1) +": " + num[j]);
		}

	}
}