import java.util.Scanner;
public class Main {
	public static void main(String[]  args) {
		Scanner input = new Scanner(System.in);	
		long a = input.nextLong();
        long b = input.nextLong();
        long x = input.nextLong();
        long count;
        if(b%x !=0) {
           count = Math.abs(b-a)/(x);}
        else {
        count = Math.abs(b-a)/(x)+1;}
        System.out.println(count);
		   }			
		}