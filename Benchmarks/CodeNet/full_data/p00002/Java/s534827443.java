import java.util.Scanner;


public class Main{
	static int turn=0;
	static int dfs(int sum) {
		if(0<=sum && sum<=9) {
			return 1;
		}
		return dfs(sum/10)+1;
	}
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		while(sc.hasNext()) {
    			int a=sc.nextInt();
    			int b=sc.nextInt();
    			int sum=a+b;
    			System.out.println(dfs(sum));
    		}
    	}
    }
}
