import java.util.Scanner;

public class Main {
	static boolean isPrime[] = new boolean[50001];
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNext()){
    		int a = input.nextInt();
    		System.out.println(senhiki(a));
    	}
    }
    
    public static int senhiki(int a){
    	return (a*a+a+2)/2;
    }
}