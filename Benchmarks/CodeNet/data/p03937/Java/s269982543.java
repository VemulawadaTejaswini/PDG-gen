import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int H=sc.nextInt();
    	int W=sc.nextInt();

    	int counter=0;
    	for(int i=0;i<H;i++) {
    		String buf=sc.next();
    		counter+=countsharp(buf);
    	}

    	if(counter==H+W-1) {
    		System.out.println("Possible");
    	}else {
    		System.out.println("Impossible");
    	}

    }


    public static int countsharp(String str) {

    	int counter=0;
    	for(int i=0;i<str.length();i++) {
    		if(str.substring(i,i+1).equals("#")) {
    			counter++;
    		}
    	}

    	return counter;

    }
}

