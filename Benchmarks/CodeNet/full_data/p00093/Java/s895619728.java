//Volume0-0093
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//declare
		ArrayList<String> result = new ArrayList<String>();
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
        			result.add(String.valueOf(i));
        			exst = true;
       			}
        	}
        	if(!exst){result.add("NA");}
        	result.add("");
        }

        //output
        for(i=0;i<result.size()-1;i++){
        	System.out.println(result.get(i));
       	}
	}
}