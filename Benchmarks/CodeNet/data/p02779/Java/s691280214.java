import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[200001];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		boolean flag=true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
