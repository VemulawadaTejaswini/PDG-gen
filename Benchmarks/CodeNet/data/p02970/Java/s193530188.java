import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        if(N%(2*D+1)==0){

            System.out.println(N/(2*D+1));
            return;
        }
        System.out.println(N/(2*D+1)+1);
    }
}