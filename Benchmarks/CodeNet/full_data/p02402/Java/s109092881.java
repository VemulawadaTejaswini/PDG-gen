import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int a[] = new int [n];
    	int sum = 0;
    	for(int i = 0;i < n;i++){
    		a[i] = in.nextInt();
    		sum = sum + a[i];
    	}
    	Arrays.sort(a);
    	System.out.printf("%d %d %d",a[0],a[a.length - 1],sum);
	}
}