import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = Integer.parseInt(sc.next()); //N
		int number[]= new int [n];
		int sub[] =new int [n];
		int a=0;
		for(int i=0;i<n;i++) {
			number[i]= Integer.parseInt(sc.next()); 
			sub[i]=number[i];
		}
		
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				number[i]=sub[i];
			}
			number[k]=0;
			for(int j=0;j<n-1;j++) {
				for(int i=0;i<n-1;i++) {
					if(number[i+1]>number[i]) {
						a = number[i];
						number[i]= number[i+1];
						number[i+1] =a;
					}		
				}
			}
			System.out.println(number[n/2-1]);
		}
	}
}
