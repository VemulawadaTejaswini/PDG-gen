import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);
    	int N=sc.nextInt();

    	String[] S=sc.next().split("");

    	int sum=0;
    	int max=-1;
    	for(int i=0;i<S.length;i++) {

    		if(S[i].equals("I")) {
    			sum++;
    		}else {
    			sum--;
    		}

    		if(max<sum) {
    			max=sum;
    		}

    	}
    	
    	if(max==-1) {
    		max=0;
    	}

    	System.out.println(max);
    }
}

