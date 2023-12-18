import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
	    int[] b=new int[n];
	    int tmp=0;
	    for(int i=0;i<n;i++){
	        b[i]=a[i];
	        int j=0;
	        do{
	            tmp=b[i-j];
	            b[i-j]=b[j];
	            b[j]=tmp;
	            j++;
	        }while(j<=i/2);
	       }
	       for(int i=0;i<n;i++)
	       System.out.print(b[i]+" ");
	   
	}
}