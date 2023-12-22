
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
	        int[] n =new int[10];
	        int m;
	        int i=0;
	        while(stdIn.hasNext()){
	            m=stdIn.nextInt();
	            if(m!=0){
	                n[i]=m;
	                i++;
	            }
	            else{
	                i--;
	                System.out.println(n[i]);
	            }
	        }
	    }
	 
	}