
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] list = new int[n];
        for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
        
        Arrays.sort(list);
        
        int sum = 0;
        for (int i = 0; i < k; i++) {
			sum += list[list.length - i - 1];
		}
        
        System.out.println(sum);
       
    }
}