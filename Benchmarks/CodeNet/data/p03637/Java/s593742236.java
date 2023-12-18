import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int i;
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int d=0,b2=0,c4=0;
		for (i = 0; i < n; i++) {
			if(a[i]==2)
				b2++;
			else if(a[i]%4==0)
				c4++;
			else
				d++;	
		}
		if(b2%2==0 && c4>=d-1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}
