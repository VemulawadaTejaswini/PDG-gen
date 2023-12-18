import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
       int max = 0;
       int N = stdIn.nextInt();
       int[] V = new int[N];
       int[] C = new int[N];
       for(int i=0;i<V.length;i++)
    	   V[i] = stdIn.nextInt();
       for(int i=0;i<C.length;i++)
    	   C[i] = stdIn.nextInt();
       for(int i=0;i<V.length;i++) {
    	   if((V[i]-C[i])>0)
    		   max +=V[i]-C[i];
    	   else
    		   ;
       }
       System.out.println(max);
	}
}