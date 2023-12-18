import java.util.*;
 
public class Main{

	public static void main(String []args){
	    Scanner sc= new Scanner(System.in);
	    
		long n=sc.nextInt();
		long total=0;
		long temp;
		for(int i=0; i<n; i++){
		    temp=sc.nextLong();
		    if(temp<0){
		        temp=temp*-1;
		    }
		    total=temp+total;
		}
		System.out.println(total);
	}
}