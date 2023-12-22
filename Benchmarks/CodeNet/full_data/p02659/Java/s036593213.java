    import java.util.Scanner;
    
    public class Main {
    	public static void main(String[] args){
    		Scanner scan = new Scanner(System.in);
    		int a = scan.nextInt();
    		double b = scan.nextDouble();
    		int c = (int) (a*b);
    		System.out.println(c);
    	}
    }