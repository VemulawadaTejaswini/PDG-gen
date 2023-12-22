import java.awt.print.Printable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		insertsort(arr,n);
	}

	public  static void insertsort(int[] arr,int n){
		arrPrint(arr);
		for(int i=1;i<n;i++){
			int tmp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>tmp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=tmp;
			arrPrint(arr);
		}
	}
	public static void arrPrint(int[] arr){
		int i=0;
		for(i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println(arr[i]);
	}
}

