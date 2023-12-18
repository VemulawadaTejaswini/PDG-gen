    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args){
    		 Scanner sc = new Scanner(System.in);

    		 int N = sc.nextInt(); //支払う
    		 int A = sc.nextInt();//1円硬貨

    		 int NA = N - A;

    		 if(NA % 500 == 0) {
    			 System.out.println("Yes");
    		 }else {
    			 System.out.println("No");
    		 }

    	}
    }