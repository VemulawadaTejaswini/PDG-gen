

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static int cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		//insertsort(arr,n);
		//bubblesort(arr,n);
		//selectSort(arr, n);
		shellSort(arr,n);
	}

	//输出超时 我也不知道为什么
	private static void shellSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		
		int h=1;
		while(true){
			if(h>n) break;
			list.add(h);
			h=h*3+1;
			
		}
		
		Collections.reverse(list);
	   // Integer[] g=(Integer[])list.toArray();
		int m=list.size();
		for(int i=0;i<m;i++){
			shellinsert(arr,n,list.get(i));
		}
		StringBuilder builder=new StringBuilder();
		builder.append(m);
		builder.append("\n");
		builder.append(list.get(0));
		for(int i=1;i<m;i++){
			builder.append(" ");
			builder.append(list.get(i));
		}
		builder.append('\n');
		builder.append(cnt).append('\n');
		for(int i=0;i<n;i++){
			builder.append(arr[i]).append('\n');
		}
		System.out.println(builder);	
//		System.out.println(m);
//		for(int i=0;i<m-1;i++)
//			System.out.print(list.get(i)+" ");
//		System.out.println(list.get(m-1));
//		System.out.println(cnt);
//		for(int i=0;i<n-1;i++)
//			System.out.println(arr[i]+" ");
//		System.out.println(arr[n-1]);
	}

	private static void shellinsert(int[] arr, int n, int gi) {
		// TODO Auto-generated method stub
		for(int i=gi;i<n;i++){
			int v=arr[i];
			int j=i-gi;
			while(j>=0&&arr[j]>v){
				arr[j+gi]=arr[j];
				j=j-gi;
				cnt++;
			}
			arr[j+gi]=v;
		}
	}

	public  static  void selectSort(int[] arr,int n){
		int sum=0;
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[min]>arr[j])
					min=j;
			}
			
			if(min!=i){
				swap(arr,min,i);
				sum++;
			}
				
		}
		arrPrint(arr);
		System.out.println(sum);
	}
	private static void swap(int[] arr, int i,int j) {
		// TODO Auto-generated method stub
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

	public  static void insertsort(int[] arr,int n){
		arrPrint(arr);
		for(int i=1;i<n;i++){
			int tmp=arr[i];//必须要使用tmp把这个值存起来，因为后面可能会有变动
			int j=i-1;
			while(j>=0&&arr[j]>tmp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=tmp;
			arrPrint(arr);
		}
	}
	
	public static void bubblesort(int[] arr,int n){
		int res=0;
		for(int i=0;i<n;i++){
			boolean flag=false;
			for(int j=n-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int tmp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
					flag=true;
					res++;
				}
				
			}
			if(flag==false)
				break;
		}
		arrPrint(arr);
		System.out.println(res);
	}
	
	
	public static void arrPrint(int[] arr){
		int i=0;
		for(i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[i]);
	}
}

