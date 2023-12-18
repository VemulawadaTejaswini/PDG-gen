import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double c = sc.nextDouble();
    	sc.close();
    	double aa = Math.sqrt(a);
    	double bb = Math.sqrt(b);
    	double cc = Math.sqrt(c);
    	boolean ans = false;
    	if(aa + bb < cc){
    		ans = true;
    	}
    	System.out.println(ans?"Yes":"No");
    }

}