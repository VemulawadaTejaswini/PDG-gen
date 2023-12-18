package sd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr1[]=new int[n],arr2[]=new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr1[i]=in.nextInt();
			arr2[i]=arr1[i];
		}
		Arrays.sort(arr2);
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n-1;i++){
			for (int j = i+1; j < n; j++) {
				boolean s=true;
				for (int k = 0; k < list.size(); k++) {
					if(arr1[j]==list.get(k)){
						s=false;
						break;
					}
				}
				if(s){
					if(arr1[j]==arr2[i]){
						int t=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=t;
						list.add(arr1[i]);
						list.add(arr1[j]);
						break;
					}
				}
			}
		}
		if(Arrays.equals(arr1, arr2)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
