import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        char[] list = {'a','b','c','d','e','f','g','h','i','j'};
//        StringBuilder sb = new StringBuilder("a");
//        for(int i=1; i<n; i++) {
//           
//            
//        }
        long a = in.nextInt();
        long b = in.nextInt();
        long c = in.nextInt();
        if(16*a*b<c*c)System.out.print("Yes");
        else System.out.print("No");

    }

}
