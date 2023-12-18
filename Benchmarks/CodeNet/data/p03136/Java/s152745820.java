import java.util.Scanner;

 class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);

	        int sumOfLeft=0;
        	int max=0;
	        int side=0;
        	 for(int i=0;i<s.nextInt();i++){
	             side=s.nextInt();
        	     if(max<side){
                	 sumOfLeft+=max;
	                 max=side;
        	     }
	             else{
			 sumOfLeft+=side;
			}
        	 }
	         if(sumOfLeft>=max) System.out.println("No");
        	 else System.out.println("Yes");
     }
 }
