import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int ans = 0;
		for(int i = 0;i<5;i++) {
			arr[i] = i+1;
		}
		for(int i = 0;i<5;i++) {
			if(arr[i] == 0) {
				ans = i+1;
			}
		}
		System.out.println(ans);
	}

}
