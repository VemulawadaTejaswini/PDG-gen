import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	String a=sc.next();
    	String b=sc.next();
    	String c=sc.next();
    	
    	boolean first=a.substring(a.length(),a.length()+1).equals(b.substring(0, 1));
    	boolean last=b.substring(b.length(),b.length()+1).equals(c.substring(0, 1));
    	
    	if(first && last) {
    		System.out.println("YES");
    	}else {
    		System.out.println("NO");
    	}
    }
}
