import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main{  
	
 	public static final Scanner in =new Scanner(System.in);
 	public static void main(String args []){
 		int n = in.nextInt();
 		int m = in.nextInt();
 		int a[] = new int [n];
 		int sum=0;
 		for(int i=0;i<n;i++){
 			a[i]=in.nextInt();
 			sum+=a[i];
 		}int count=0;
 		int b = (sum)/(4*m);
 		for(int i=0;i<n;i++){
 			if(a[i]>b){
 				count++;
 			}
 		}
 		if(count>=m){
 			System.out.println("Yes");
 		}else{
 			System.out.println("No");
 		}
 	}


}