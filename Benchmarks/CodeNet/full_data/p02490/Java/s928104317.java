import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan;

		int x[] = new int[10000];
		int y[] = new int[10000];
		int temp,i;

		for(i=0;;i++){
			scan = new Scanner(System.in);

			x[i] = scan.nextInt();
			y[i] = scan.nextInt();

			if(x[i] == 0 && y[i] == 0){
				break;
			}
		}

		for(int j=0;j<i;j++){
			temp = x[j];
			x[j] = y[j];
			y[j] = temp;

			System.out.println(x[j] + "," + y[j]);
		}

	}
}