import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long H = sc.nextLong();
    	long W = sc.nextLong();
    	sc.close();
    	if(Math.min(H, W) == 1){
    		System.out.println(1);
    		return;
    	}
    	System.out.println((long)Math.ceil(H * W / 2.0));
    }

}