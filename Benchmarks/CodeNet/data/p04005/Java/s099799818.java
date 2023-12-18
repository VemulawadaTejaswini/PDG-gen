import java.util.Arrays;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int[] L=new int[3];

    	for(int i=0;i<3;i++) {
    		L[i]=sc.nextInt();
    	}

    	Arrays.sort(L);

    	int base=L[0]*L[1];

    	if(L[3]%2==0) {
    		System.out.println("0");
    	}else {
    		System.out.println(base);
    	}
    }


}

