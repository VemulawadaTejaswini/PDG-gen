import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.next());
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.valueOf(sc.next());
		}
		sc.close();
		for(int i=1;i<n;i++){
			print(arr);
			int t=arr[i];
			int j=i-1;
			while(j>=0&&t<arr[j]){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=t;
		}
		print(arr);
	}
	public static void print(int[] arr){
		System.out.print(arr[0]);
		for(int i= 1;i<arr.length;i++)
			System.out.print(" "+arr[i]);

		System.out.println();
	}
}