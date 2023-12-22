import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, i, j, temp = 0;
		Scanner stdin = new Scanner(System.in);
		n = stdin.nextInt();		
		int a[] = new int[1000];
		for (i = 0; i < n; i++) {
			a[i] = stdin.nextInt();
		}
		j = i - 1;
		i = 0;
		while (i < j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		for (i = 0; i < n; i++) {
			if(i == n-1) {
				System.out.println(a[i]);
			}else {
				System.out.print(a[i]+" ");
			}
		}
	}
}