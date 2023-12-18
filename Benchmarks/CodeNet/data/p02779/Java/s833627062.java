import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int[] arr=new int[i];
		for(int x=0;x<arr.length;x++) {
			arr[x]=sc.nextInt();
		}
		boolean f=true;
		Arrays.sort(arr);
		for(int x=0;x<arr.length-1;x++) {
			if (arr[x]==arr[x+1])
				f =false;
		}
		if (f==true)
			System.out.println("YES");
		else 
			System.out.println("NO");
		
	}

}
