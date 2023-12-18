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

    	String hand=Sa[0];

    	while(true) {
	    	if(hand.equals("a")) {

	    		if(indexA!=Sa.length-1) {
	    			indexA++;
	    			hand=Sa[indexA];
	    		}else {
	    			System.out.println("A");
	    			return;
	    		}

	    	}else if(hand.equals("b")) {

	    		if(indexB!=Sb.length-1) {
	    			indexB++;
	    			hand=Sb[indexB];
	    		}else {
	    			System.out.println("B");
	    			return;

	    		}
	    	}else {
	    		if(indexC!=Sc.length-1) {
	    			indexC++;
	    			hand=Sc[indexC];
	    		}else {
	    			System.out.println("C");
	    			return;

	    		}
	    	}
    	}


    }
}

