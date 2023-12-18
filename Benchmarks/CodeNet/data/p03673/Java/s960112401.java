import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(arr[0] + "");
		for(int i=1; i<n; i++){
			arrayList.add(arr[i] + "");
			Collections.reverse(arrayList);
		}
		
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println("");
	}
}