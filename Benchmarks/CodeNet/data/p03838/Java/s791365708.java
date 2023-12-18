import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
    public void run() throws Exception {
    	//StringBuilder sb = new StringBuilder();

    	int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
    	int anw = 0;

    	if(n1 == n2){
    		System.out.println(0);
    		return;
    	}

    	if(Math.abs(n1) == Math.abs(n2)){
    		System.out.println(1);
    		return;
    	}

    	if(n1 < n2){
    		//anw = n2 - n1;
    		if(n2 < 0){
    			anw = Math.abs(Math.abs(n2) - Math.abs(n1)) + 1;
    		}else {
    			//anw = Math.abs(n2) - Math.abs(n1) + 1;
    			anw = n2 - n1;
    		}
    	}else {
    		if(n2 < 0){
    			anw =  Math.abs(Math.abs(n2) - Math.abs(n1)) + 2;
    		}else {
    			//anw = Math.abs(n2) - Math.abs(n1) + 1;
    			anw = n1 - n2 + 1;
    		}

    	}

    	System.out.println(anw);
    }
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}