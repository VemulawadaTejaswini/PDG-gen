import java.util.Arrays;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	long[] L=new long[3];

    	for(int i=0;i<3;i++) {
    		L[i]=sc.nextLong();
    	}

    	Arrays.sort(L);

    	long base=L[0]*L[1];

    	if(L[2]%2==0) {
    		System.out.println("0");
    	}else {
    		System.out.println(base);
    	}
    }


}

