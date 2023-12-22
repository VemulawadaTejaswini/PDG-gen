//Volume0-0084
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		String[] ward;
		boolean  flg = false;

        Scanner sc = new Scanner(System.in);
        ward = sc.nextLine().split("(\\.|\\s|,)");

        for(int i=0;i<ward.length;i++){
        	if(ward[i].length() >= 3 && ward[i].length() <= 6){
            	if(flg){System.out.print(" ");}
        		System.out.print(ward[i]);
            	flg = true;
        	}
        }
        System.out.println();
	}
}