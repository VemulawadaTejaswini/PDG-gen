    import java.util.Scanner;
    public class Main {
    	public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		int n=sc.nextInt(),k=sc.nextInt();
    		System.out.println(k*(int)Math.pow(k-1, n-1));
    		sc.close();
    	}
    }