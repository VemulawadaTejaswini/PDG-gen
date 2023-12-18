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

    	String buf="";

    	for(int i=0;i<H;i++) {


    		for(int j=0;j<W;j++) {
    			buf=sc.next();

    			if(buf.equals("snuke")) {

    				char c=(char) ((j+1)-'A');

    				String result=String.valueOf(c).toUpperCase()+(i+1);


    				System.out.println(result);
    				return ;
    			}
    		}

    	}


    }
}

