import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        sc.close();
        int min = (int)(-1*Math.pow(10, 3));
        int max = (int)(Math.pow(10, 3));
    
        for(int i= min; i < max; i++) {
            for(int j=i-1; j>=min; j--){
                long A = (long)(Math.pow(i, 5));
                long B = (long)(Math.pow(j, 5));
                if(A - B == X){
                    System.out.println(i + " " + j);
                    return;
                }
                if(i-j > X){
                    break;
                }
            }
        }
    }
}
