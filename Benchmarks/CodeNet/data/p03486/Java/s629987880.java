import java.util.Arrays;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	String[] A=sc.next().split("");
    	String[] B=sc.next().split("");

    	Arrays.sort(A);
    	Arrays.sort(B);

    	String strA=A.toString();
    	String strB=B.toString();

    	if(strA.compareTo(strB)<0) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }


}

