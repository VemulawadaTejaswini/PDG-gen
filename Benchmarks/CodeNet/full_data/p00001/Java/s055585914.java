package test;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int[] arr=new int[10];
		int i=0;
		while(i<10){
		    arr[i] =reader.nextInt();
		    i++;
		}
		insertSort(arr);
		
	}
	public static void insertSort(int[] arr)
	{
		for(int n=1;n<arr.length;n++)
		{
			for(int i=n;i>0;i--)
			{
				if(arr[i-1]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
			}
		}
		//int k=arr.length;
		for(int j=arr.length-1;j>arr.length-4;j--)
		{
			System.out.println(arr[j]);
		}

}}