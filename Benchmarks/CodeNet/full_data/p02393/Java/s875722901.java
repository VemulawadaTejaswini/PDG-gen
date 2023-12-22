import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int[] array = new int[3];

		for(int i=0;i<3;i++) {
			array[i] = sc.nextInt();
		}

		int tmp;

		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(array[j]<array[i]) {
					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}

		for(int i=0;i<3;i++) {
			System.out.print(array[i]);
			if(i!=2) {
				System.out.print(" ");
			}
		}

		sc.close();
	}
}
