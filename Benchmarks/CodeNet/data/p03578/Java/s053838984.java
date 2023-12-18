import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	List<String> D=new ArrayList<String>();

    	for(int i=0;i<N;i++) {
    		D.add(sc.next());
    	}

    	int M=sc.nextInt();

    	List<String> T=new ArrayList<String>();

    	for(int i=0;i<M;i++) {
    		T.add(sc.next());
    	}

    	for(int i=0;i<M;i++) {
    		String buf=T.get(i);

    		if(!D.contains(buf)) {
    			System.out.println("NO");
    			return;
    		}else {
    			D.remove(buf);
    		}
    	}

    	System.out.println("YES");
    }

}

