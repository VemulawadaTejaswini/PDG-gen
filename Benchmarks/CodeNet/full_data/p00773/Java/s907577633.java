import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int s = sc.nextInt();
        	if(x + y + s == 0) break;
        	int max = 0;
        	for(int i=1;i<s;i++) {
        		for(int j=1;j<=s-i;j++) {
        			int a = i*(100+x)/100;
        			int b = j*(100+x)/100;
        			if(a + b != s) continue;
            		int ay = i*(100+y)/100;
            		int by = j*(100+y)/100;
            		max = Math.max(ay+by, max);
        		}
        	}
        	System.out.println(max);
         }
       
    }
}
