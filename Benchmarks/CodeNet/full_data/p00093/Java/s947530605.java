//Volume0-0093
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		String[] s;
		int a,b,i;
		boolean flg,exst;

        //input
        Scanner sc = new Scanner(System.in);
        while(true){
        	s = sc.nextLine().split("\\s");
        	a = Integer.parseInt(s[0]);
        	b = Integer.parseInt(s[1]);
        	if(a+b == 0){break;}

        	//calculate
        	exst = false;
        	for(i=a;i<=b;i++){
        		flg = false;
        		if(i%400==0){
        			flg = true;
       			} else if(i%4==0 && i%100!=0){
					flg = true;
				}
        		if(flg){
        			System.out.println(i);
        			exst = true;
       			}
        	}

        	//output
        	if(!exst){System.out.println("NA");}
        	System.out.println();
        }
	}
}