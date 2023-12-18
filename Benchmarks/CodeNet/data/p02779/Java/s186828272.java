import java.util.*;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		Boolean flag = true;
		for (int i = 0; i < n-1 && flag; i++) {
			if (arr[i] == arr[i+1])
				flag = false;
		}			
		if (flag)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}