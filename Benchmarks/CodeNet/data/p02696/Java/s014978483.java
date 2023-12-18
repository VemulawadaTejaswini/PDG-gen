import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);
    	int A = sc.nextInt();
    	long B = sc.nextLong();
    	long N = sc.nextLong();
    	long max = 0;

    	for(int i=1;i<=N;i++) {
    		long tmp = (long) (Math.floor(A*i/B)-A*Math.floor(i/B));
    		if(tmp>=max) {
    			max=tmp;
    		}
    	}
    	System.out.print(max);
    }
}