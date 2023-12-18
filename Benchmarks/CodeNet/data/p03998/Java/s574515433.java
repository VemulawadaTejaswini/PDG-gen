import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String[] Sa=sc.next().split("");
    	String[] Sb=sc.next().split("");
    	String[] Sc=sc.next().split("");

    	int indexA=0;
    	int indexB=0;
    	int indexC=0;

    	String hand="a";

    	while(true) {
	    	if(hand.equals("a")) {

	    		hand=Sa[indexA];
	    		if(indexA<Sa.length) {
	    			indexA++;
	    		}else {
	    			System.out.println("A");
	    			return;
	    		}

	    	}else if(hand.equals("b")) {
	    		hand=Sb[indexB];
	    		if(indexB<Sb.length) {
	    			indexB++;
	    		}else {
	    			System.out.println("B");
	    			return;
	    		}
	    	}else {
	    		hand=Sc[indexC];
	    		if(indexC<Sc.length) {
	    			indexC++;
	    		}else {
	    			System.out.println("C");
	    			return;

	    		}
	    	}
    	}


    }
}

