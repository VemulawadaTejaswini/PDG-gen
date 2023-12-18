import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int c=sc.nextInt();

    	int l=b-a;
    	int r=c-b;

    	if(l==r) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");
    	}
    }
}
