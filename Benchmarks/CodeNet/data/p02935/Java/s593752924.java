import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int w = sc.nextInt();
      	int h = sc.nextInt();
      	int x = sc.nextInt();
      	int y = sc.nextInt();
      
      	System.out.println(w*h*0.5 + " " + 
                          ((w==2*x && h==2*y) ? 1: 0)); 
    }
}