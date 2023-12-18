import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
                int[] arr = new int[a];
                for (int i = 0; i < a; i++) {
                     a[i] = sc.nextInt();
                }
                int count = 0;
                if (a[a[i]] == i) {
                     count++;
                }
		System.out.println(count / 2);
	}
}