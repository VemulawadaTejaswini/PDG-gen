import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = Integer.parseInt(sc.next());
    	int B = Integer.parseInt(sc.next());
    	int C = Integer.parseInt(sc.next());
    	int X = Integer.parseInt(sc.next());

    	int ans = 0;
    	for (int a=0; a<=A; a++){
    		for (int b=0; b<=B; b++){
        		int c_estimated = (X - a * 500 - b * 100)/50;
        		if (c_estimated>=0 && c_estimated <= C){
        			ans++;
        		}
        	}
    	}
    	System.out.println(ans);
    }
}
