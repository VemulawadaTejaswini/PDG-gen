import java.util.Scanner;

 class atcoder2{

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);

		int[] L=new int[s.nextInt()];

		for(int i=0;i<L.length;i++){
			L[i]=s.nextInt();
		}
	        int sumOfLeft=0;
        	int max=0;
	        int side=0;
        	 for(int i=0;i<L.length;i++){
	             side=L[i];
        	     if(max<side){
                	 sumOfLeft+=max;
	                 max=side;
        	     }
	             else sumOfLeft+=side;
        	 }
	         if(sumOfLeft>max) System.out.println("No");
        	 else System.out.println("Yes");
     }
 }
