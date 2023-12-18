import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String[] S=sc.next().split("");
    	
    	for(int i=0;i<S.length;i++) {
    		
    		if(S[i].equals("C")) {
    			for(int j=i+1;j<S.length;j++) {
    				if(S[j].equals("F")) {
    					System.out.println("Yes");
    					return;
    				}
    			}
    		}
    		
    	}
    	
    	System.out.println("No");
    }
}

