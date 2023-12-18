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
    	if(W % 2 != 0 && H % 2 != 0){
    		ans = (H * W) / 2 + 1;
    	}else if(W % 2 == 0 && H % 2 == 0){
    		ans = (H * W) / 2;
    	}else if(W % 2 != 0 && H % 2 == 0){
    		ans = ((H * (W-1)) / 2) + (H / 2);
    	}else if(W % 2 == 0 && H % 2 != 0){
    		ans = (H * W) / 2;
    	}
    	System.out.println(ans);
    }

}