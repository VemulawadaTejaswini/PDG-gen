import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="APPROVED";
		int n=sc.nextInt();
        int[] a=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      for(int i=0;i<n;i++){
      	if(a[i]%2==0&&(a[i]%3!=0&&a[i]%5!=0))o="DENIED";
      }
        
      	System.out.println(o);
    }
    
}