
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int[] a=new int[N];
	 for(int i=0;i<N;i++) {
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<N;i++) {
		 int max=0;
		 for(int j=0;j<N;j++) {
			 if(a[j]>max&&j!=i) {
				 max=a[j];
			 }else if(j==i) {
				 continue;
			 }
			 
		 }
		 System.out.println(max);
		 
	 }

	 
	 
 }
	


}


