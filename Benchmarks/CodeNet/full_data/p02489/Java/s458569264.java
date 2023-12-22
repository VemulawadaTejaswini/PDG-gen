import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		int num[] = new int[50];
		int i, temp;

		for(i=0;;i++){
			Scanner scan = new Scanner(System.in);
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