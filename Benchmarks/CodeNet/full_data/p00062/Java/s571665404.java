//Volume0-0062
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		//declare
		final int    LEN = 10;
		      int [] ar  = new int[LEN];
		      char[] ch;

		//input
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	 ch = sc.nextLine().toCharArray();
        	 for(int i=0;i<LEN;i++){
        		 ar[i] = Character.digit(ch[i], 10);
        	 }

        	 //calculate
        	 for(int i=1;i<LEN;i++){
        		 for(int j=0;j<LEN-i;j++){
        			 ar[j] = (ar[j]+ar[j+1]) % 10;
        		 }
        	 }

        	 //output
        	 System.out.println(ar[0]);
        }
	}
}