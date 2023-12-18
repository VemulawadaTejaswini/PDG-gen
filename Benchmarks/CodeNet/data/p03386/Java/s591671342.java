import java.util.Scanner;

public class Main {
	public static void main(String args[]){
	      Scanner sn = null;
	      sn = new Scanner(System.in);
	        String S = sn.nextLine();
	        String[] list = S.split(" ",0);
	        int A=Integer.parseInt(list[0]);
	        int B=Integer.parseInt(list[1]);
	        int K=Integer.parseInt(list[2]);

	        for(int i=0;i<K;i++){
	        	System.out.println(A+i);
	        }

	        for(int j=0;j<K;j++){
	        	System.out.println(B-K+1+j);
	        }
	}
}
