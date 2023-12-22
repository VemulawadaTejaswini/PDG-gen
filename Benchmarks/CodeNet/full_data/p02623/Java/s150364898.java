import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int  n =scn.nextInt();
		int m =scn.nextInt();
		long k =scn.nextLong();
		long [] arr =new long[n];
		long [] arr2 =new long[m];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextLong();
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=scn.nextLong();
		}
//		Arrays.sort(arr);
//		Arrays.sort(arr2);
		int i=0;
		int j=0;
		long count =0;
		while(k>0 && i<arr.length && j<arr2.length){
			if(arr[i]>arr2[j]){
				k-=arr2[j];
				j++;
			}else{
				k-=arr[i];
				i++;
			}
			if(k>=0)
			count++;
		}
		while(k>0 && i<arr.length){
			k-=arr[i];
			i++;
			if(k>=0)
			count++;
		}
		while(k>0 && j<arr2.length){
			k-=arr2[j];
			j++;
			if(k>=0)
			count++;
		
		}
		System.out.println(count);

	}

}