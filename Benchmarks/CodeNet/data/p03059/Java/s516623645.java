import java.util.Scanner;
class Main {
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
       long total = 0;
       int N = stdIn.nextInt();
       int[] A = new int[N];
       for(int i=0;i<A.length;i++)
    	   A[i] = stdIn.nextInt();
       for(int i=0;i<(A.length-1);i++) {
    	   if(A[i]-A[i+1]<0 && A[i]<0) {
    		   A[i] = -A[i];
    		   A[i+1] = -A[i+1];
    	   }
    	   else
    		   ;
       }
       for(int i=0;i<A.length;i++)
    	   total +=A[i];
       System.out.println(total);
}
}

