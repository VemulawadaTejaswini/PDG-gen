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

    	int x=sc.nextInt();
    	int y=sc.nextInt();

    	Set<Integer> setA=new TreeSet<Integer>();
    	setA.add(4);
    	setA.add(6);
    	setA.add(9);
    	setA.add(11);

    	if(setA.contains(x) && setA.contains(y)) {
    		System.out.println("Yes");
    	}else if(x==2 || y==2) {
    		System.out.println("No");
    	}else if(!setA.contains(x) && !setA.contains(y)) {
    		System.out.println("Yes");
    	}


    }
}
