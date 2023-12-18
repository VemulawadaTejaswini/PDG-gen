import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] a=new int[n];
	  boolean f=true;
	  for(int i=0;i<n;i++) {
		  a[i]=sc.nextInt();
		  if(a[i]%2!=0)f=false;
	  }
	  if(f) {
		  Arrays.sort(a);
		  int count=0;
		  while(f) {
			  count++;
			  for(int i=0;i<n;i++) {
				  a[i]/=2;
				  if(a[i]%2!=0)f=false;
			  }
		  }
		  System.out.println(count);
	  }else {
		  System.out.println(0);
	  }

  }
}

