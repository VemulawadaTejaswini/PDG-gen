import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[5];
		int count =0;

		for(int i=0;i<5;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			count +=1;
			if(x[i]==0) {
				break;
			}
		}
		System.out.println(count);
	}
}