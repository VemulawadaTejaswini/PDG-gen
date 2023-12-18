import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n      = Integer.parseInt(sc.nextLine());
		String[] t = sc.nextLine().split(" ");
		int[] list = new int[n];

		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(t[i]);
		}

		Arrays.parallelSort(list);
		int cnt = 0;

		for(int i = n - 1;i > 1; i--){
			for(int j = i - 1; j > 0; j--){
				int a = BinarySearch(list, list[i] - list[j] + 1);
		        if(a < j){
		          cnt += j - a;
		        }
		      }
		    }
		    System.out.println(cnt);
		  }

		  public static int BinarySearch(int a[] , int target){
		    int left = -1;
		    int right = a.length;

		    while(right - left > 1){
		      int mid = left + (right - left) / 2;
		      if(a[mid] >= target){
		        right = mid;
		      }else{
		        left = mid;
		      }
		    }
		    return right;
		  }
}
