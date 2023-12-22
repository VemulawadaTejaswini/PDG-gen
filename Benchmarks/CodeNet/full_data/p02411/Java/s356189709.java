import java.util.Scanner;

class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    while (sc.hasNextLine()){
	    	int m = sc.nextInt();
	    	int f = sc.nextInt();
	    	int r = sc.nextInt();
	    	String result = "F";

	    	if (m == -1 && f == -1 && r == -1)
	    		break;

	    	if (m+f>=30){
	    		result="D";
	    		if (r>=50){
		    		result="C";
		    	}
	    	}

	    	if (m+f>=50){
	    		result="C";
	    	}


	    	if (m+f>=65){
	    		result="B";	    	}

	    	if (m+f>=80){
	    		result="A";
	    	}

	    	if (m==-1||f==-1){
	    		result="F";
	    	}

	    	System.out.println(result);

	    }
	}

}

