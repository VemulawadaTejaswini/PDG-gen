import java.util.Scanner;import java.util.Arrays;
public class tamrini {
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	int [] a;a=new int [3];
	a[0] = scanner.nextInt();
	a[1] = scanner.nextInt();
	a[2] = scanner.nextInt();
	Arrays.sort(a);
	int sum=0;
	for (int i=1;i<3;i++) {
		if (a[i]==a[i-1]) sum++;
	}
	if (sum==1) System.out.println("YES");
	else System.out.println("NO");
	scanner.close(); }}