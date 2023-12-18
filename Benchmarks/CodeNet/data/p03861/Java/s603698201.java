import java.util.Scanner;
public class Main {
	public static void main(String[]  args) {
		Scanner input = new Scanner(System.in);	
		long a = input.nextLong();
        long b = input.nextLong();
        long x = input.nextLong();
        long count;
        if(b%x ==0 || a == x) {
        	count = Math.abs(b-a)/(x)+1;}
        else{
        	count = Math.abs(b-a)/(x);}
        System.out.println(count);
		   }			
		}
	
	
