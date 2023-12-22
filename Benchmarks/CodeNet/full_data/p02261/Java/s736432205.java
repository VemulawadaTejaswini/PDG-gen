import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		String[] b=new String[n];
		for(int i=0;i<n;i++){
			a[i]=sc.next();
			b[i]=a[i];
		}
		
		a=bubbleSort(a,n);
		write(a,n);
		System.out.println("Stable");
		
		b=selectionSort(b,n);
		write(b,n);
		if(Arrays.equals(a,b)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
	}
	static void write(String[] a,int n){
		for(int i=0;i<n-1;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println(a[n-1]);
	}
	static String[] bubbleSort(String[] a, int n){
		boolean flag=true;
		int i=0;
		while(flag){
			flag=false;
			for(int j=n-1;j>i;j--){
				if(a[j].charAt(1)<a[j-1].charAt(1)){
					String temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
				}
			}
			i++;
		}
		return a;
	}
	static String[] selectionSort(String[] a, int n){
		int minj;
		for(int i=0;i<n;i++){
			minj=i;
			for(int j=i;j<n;j++){
				if(a[j].charAt(1)<a[minj].charAt(1)){
					minj=j;
				}
			}
			String temp=a[i];
			a[i]=a[minj];
			a[minj]=temp;
		}
		return a;
	}

}