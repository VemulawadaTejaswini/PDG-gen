import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int num = 100000;
    	while(n != 0){
    		num *= 1.05;
    		String strnum = String.valueOf(num);
    		if(!strnum.substring(strnum.length()-3,strnum.length()).equals("000")){
    			num = Integer.parseInt(String.valueOf((Integer.parseInt(strnum.substring(0,strnum.length()-3))+1)).concat("000"));
    		}
    		n--;
    	}
    	System.out.println(num);
    }
}