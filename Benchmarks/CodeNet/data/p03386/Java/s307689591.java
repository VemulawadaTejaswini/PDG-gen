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

    	int A=sc.nextInt();
    	int B=sc.nextInt();

    	int K=sc.nextInt();

    	Set<Integer> set=new TreeSet<Integer>();

    	for(int i=A;i<A+K-1;i++) {

    		if(i>=A && i<=B) {
    			set.add(i);
    		}
    	}

    	for(int i=B-K+1;i<=B;i++) {
    		if(i>=A && i<=B) {
    			set.add(i);
    		}
    	}

    	for(Integer i:set) {
    		System.out.println(i);
    	}




    }



}

