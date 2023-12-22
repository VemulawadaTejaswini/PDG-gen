import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
      long a=scanner.nextInt();
      long b=scanner.nextInt();
      long c=scanner.nextInt();
      long k=scanner.nextInt();
      long sum=0;
    
    	 if(k>=a&&(k-a-b)>c) {
    		 sum=a*1;
    		 k=k-a;
    	 }
    	 else if(k<a) {
    		 sum=k;
    	 }
    	 else if((k-a)<=b) {
    		 sum=a*1;
    	 }
    	 else if((k-a-b)<=c) {
    		 sum=a+(k-a-b)*(-1);
    	 }
    	System.out.println(sum);
    	 
     
   
	}

}