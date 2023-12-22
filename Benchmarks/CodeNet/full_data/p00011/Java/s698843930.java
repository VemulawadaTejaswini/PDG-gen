import java.util.Scanner;
import java.io.*;

public class Main{	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w,n,tmp;
		String[] s;
		int []a;
		int []b;
		int []number;
		w = sc.nextInt();
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		number = new int[w];
		for(int i=0;i<w;i++){
			number[i]=i+1;
		}
		for(int i=0;i<n;i++){
			s=sc.next().split(",");
			a[i]=Integer.valueOf(s[0]).intValue();
			b[i]=Integer.valueOf(s[1]).intValue();
		}
		for(int i=0;i<n;i++){
			tmp=number[a[i]-1];
			number[a[i]-1]=number[b[i]-1];
			number[b[i]-1]=tmp;
		}
		for(int i=0;i<w;i++){
			System.out.println(number[i]);
		}
		sc.close();
	}
}
