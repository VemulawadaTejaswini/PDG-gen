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

    	int N=sc.nextInt();
    	String S=sc.next();

    	int max=-1;
    	for(int i=0;i<N;i++) {

    		String str1=S.substring(0,i+1);
    		String str2=S.substring(i+1);

    		int buf=getsyurui(str1, str2);

    		if(max<buf) {
    			max=buf;
    		}

    	}

    	System.out.println(max);

    }

    public static int getsyurui(String str1,String str2) {

    	Set<String> set=new TreeSet<String>();

    	for(int i=0;i<str1.length();i++) {
    		set.add(str1.substring(i,i+1));
    	}

    	int counter=0;
    	for(String str:set) {
    		if(str2.contains(str)) {
    			counter++;
    		}
    	}

    	return counter;
    }


}

