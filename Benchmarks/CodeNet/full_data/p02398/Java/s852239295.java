import java.util.Scanner;

public class Main {
	public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int i, n=0, count=0;
        for(i=a; i<=b; i++){
        	n = c%i;
        	if(n==0){
        		count++;
        	}
        }
        System.out.println(count);
    }

}