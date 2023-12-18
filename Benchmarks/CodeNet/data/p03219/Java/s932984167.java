import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ex1();
	}
	
	public static void ex1() {
		int X=0;
		int Y=0;
		
        
        try{
            Scanner sc = new Scanner(System.in);
            //String  = br.readLine();
           X = sc.nextInt();
           Y = sc.nextInt();
        }catch(Exception e){
        }
        
        System.out.println(X+Y/2);
	}