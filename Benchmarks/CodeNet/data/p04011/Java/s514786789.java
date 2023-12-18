import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int K = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());
        int Y = Integer.parseInt(scan.next());

        if(N-K<=0 ){
            System.out.println(N*X);
        }else{
            System.out.println(K*X+(N-K)*Y);
        }
    }
}