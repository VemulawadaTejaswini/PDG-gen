import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String[] S=sc.next().split("");

    	int sum=0;
    	for(int i=0;i<S.length;i++) {

    		if(S[i].equals("1")) {
    			sum++;
    		}

    	}

    	System.out.println(sum);



    }
}

