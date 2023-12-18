import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        k = k * 500;
        if(k>=x){
        	System.out.println("Yes");
            }
       	else{
        	System.out.println("No");
            }
        }
    }