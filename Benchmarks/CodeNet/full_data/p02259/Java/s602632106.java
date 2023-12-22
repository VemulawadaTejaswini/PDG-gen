import java.util.Scanner;
public class Main {
public static void main(String[] kotai) {
	Scanner sc = new Scanner(System.in);
	int b = sc.nextInt();
	int []a = new int[b];
	for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	int count = 0;
	for(int i = 0; i < a.length; i++) {
		for(int j = 0; j < a.length; j++) {
			if(a[i] < a[j]) {
				int temp;
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				count++;
			}
		}
	}
	for(int i = 0; i < b; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println(count);
}
}
