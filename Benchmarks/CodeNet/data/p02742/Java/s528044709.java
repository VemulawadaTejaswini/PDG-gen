import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long H = sc.nextLong();
    	long W = sc.nextLong();
    	sc.close();
    	long ans = 0L;
    	long a = 0;
    	long b = 0;
    	if(W % 2 != 0){
    		a = W / 2 + 1;
    		b = W / 2;
    	}else{
    		a = W / 2;
    		b = W / 2;
    	}
    	for(int i = 1;i <= H; i++){
    		if(i % 2 != 0){
    			ans += a;
    		}else{
    			ans += b;
    		}
    	}
    	System.out.println(ans);
    }

}