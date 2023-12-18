import java.util.Scanner;

public class Main {

	static boolean[] vis = new boolean[60];

    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	sc.close();
    	if(N == 25){
    		System.out.println("Christmas");
    	}else if(N == 24){
    		System.out.println("Christmas Eve");
    	}else if(N == 23){
    		System.out.println("Christmas Eve Eve");
    	}else{
    		System.out.println("Christmas Eve Eve Eve");
    	}
    }
}