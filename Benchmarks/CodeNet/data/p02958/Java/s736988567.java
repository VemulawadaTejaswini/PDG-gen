import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void solution(int [] arr) {
		int store1[] = new int[2];
		int k=0;
		int temp [] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		Arrays.sort(temp);
		if(Arrays.equals(temp, arr)) {
			System.out.println("YES");
			return;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				store1[k]=i;
				k++;
				if(k==2) {
					break;
				}
			}
		}
		store1[1]++;
		int temp1 = arr[store1[0]];
		arr[store1[0]] = arr[store1[1]];
		arr[store1[1]] = temp1;
		if(Arrays.equals(arr, temp)) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
	}
	
	
	public static void main(String args []) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a [] = new int [n];
		for(int i=0;i<a.length;i++) {
			a[i]= obj.nextInt();
		}
		solution(a);
		
	}
}
