import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	long A = sc.nextLong();
    	long B = sc.nextLong();
    	sc.close();
    	String val = Long.toBinaryString(A);
    	int num = Integer.parseInt(val, 10);
    	for(long i = A+1; i <= B; i++){
    		String s_2 = Long.toBinaryString(i);
    		int d_2 = Integer.parseInt(s_2, 10);
    		num ^= d_2;
    	}
    	System.out.println(num);
    	String str = String.valueOf(num);
    	long dec = Long.parseLong(str, 2);
    	System.out.println(dec);
    }
}