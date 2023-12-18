import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	Set<Integer> set=new TreeSet<Integer>();
    	
    	for(int i=0;i<3;i++) {
    		int buf=sc.nextInt();
    		
    		set.add(buf);
    	}
    	
    	int result=set.size();
    	
    	System.out.println(result);
    }
}
