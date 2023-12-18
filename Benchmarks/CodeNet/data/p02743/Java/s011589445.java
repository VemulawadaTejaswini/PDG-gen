import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	sc.close();
    	boolean ans = false;
    	if(Math.sqrt(a) + Math.sqrt(b) > Math.sqrt(c)){
    		ans = true;
    	}
    	System.out.println(ans?"No":"Yes");
    }

}