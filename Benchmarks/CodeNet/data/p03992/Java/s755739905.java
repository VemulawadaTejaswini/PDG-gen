import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// get a integer
		int a = sc.nextInt();
                int[] arr = new int[a];
                for (int i = 0; i < a; i++) {
                     arr[i] = sc.nextInt();
                }
                int count = 0;
                for (int i = 0; i < a; i++) {
                     if (arr[arr[i] - 1] == (i + 1)) {
                         count++;
                     }
                }
		System.out.println(count / 2);
	}
}