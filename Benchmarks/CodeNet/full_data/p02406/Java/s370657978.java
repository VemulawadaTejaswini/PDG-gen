import java.util.Scanner;

public class Main {


    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int end_val = scan.nextInt();//end

		for(int cnt = 1; cnt <= end_val; cnt++){//1~end?????§?????°?????????3????????°?????¢???
			if(cnt % 3 == 0){
				System.out.print(" " + cnt);
			}
		}
	    scan.close();
    }
}