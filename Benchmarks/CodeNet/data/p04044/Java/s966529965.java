import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

	}

}