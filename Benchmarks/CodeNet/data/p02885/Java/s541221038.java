import java.util.Scanner;


public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	int l = a-2*b;
    	int ans;
    	
    	if (l < 0) {
    		ans = 0;
    	} else {
    		ans = l;
    	}
    	return ans;
    	
    	sc.close(); 
    }
}
