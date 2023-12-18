import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n[] = new int[20000];
		 n[0] = 1;
		for(int i=1;i<=1000;i++) {
			n[i]=n[i-1]+i+1;
		}
		for(int j=0;j<1000;j++) {
			if(n[j+1]-n[j]==b-a) {
				System.out.println(n[j]-a);
			}
		}

}
}