import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int W=sc.nextInt();
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	
    	int result=0;

    	if(b-(a+W)>=0) {
    		result=b-(a+W);
    	}else if(a-(b+W)>=0) {
    		result=a-(b+W);
    	}

    	System.out.println(result);
    }

}

