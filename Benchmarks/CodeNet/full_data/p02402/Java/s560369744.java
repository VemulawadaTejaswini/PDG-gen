import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int[] array = new int[x];
		int min = 0;
		int max = 0;
		int sum = 0;

		for(int i=0;i<x;i++) {
			array[i] = sc.nextInt();
		}

		int tmp;
		for(int i=0;i<x;i++) {
			for(int j=i+1;j<x;j++) {
				if(array[j]<array[i]) {
					tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
			if(i==0) {
				min = array[i];
			}else if(i==x-1) {
				max = array[i];
			}
			sum+=array[i];
		}

		System.out.println(min + " " + max + " " + sum);

		sc.close();
	}
}
