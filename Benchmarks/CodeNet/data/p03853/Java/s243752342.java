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


    	for(int i=0;i<H;i++) {
    		String buf=sc.next();

    		System.out.println(buf);
    		System.out.println(buf);
    	}
    }
}

