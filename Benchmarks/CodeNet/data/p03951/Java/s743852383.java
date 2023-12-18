import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();
    	String s=sc.next();
    	String t=sc.next();


    	int min=0;
    	for(int i=1;i<=N;i++) {
    		String subs=s.substring(N-i, N);
    		String subt=t.substring(0,i);

    		if(subs.equals(subt)) {

    			min=2*N-i;

    		}
    	}

    	System.out.println(min);

    }


}

