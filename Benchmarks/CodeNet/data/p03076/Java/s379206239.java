import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n[] = new int[6];
		int n2[] = new int[6];
		int n3[] = new int[6];
		for (int i = 1; i <= 5; i++) {
			n[i] = sc.nextInt();

			if (n[i] % 10 == 0) {
				n2[i] = n[i];
				n3[i] = 10;
			} else {

				n3[i] = n[i] % 10;
				n2[i] = n[i] + (10-n3[i]);
			}
		}
		int min=n3[1]+1;
		int minn=0;
		for (int i = 1; i <= 5; i++) {
			if(min>n3[i]){
				min=n3[i];
			minn=i;
			}
}

int ans=n2[1]+n2[2]+n2[3]+n2[4]+n2[5]-n2[minn]+n[minn];
System.out.println(ans);
	}
}