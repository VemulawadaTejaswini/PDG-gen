import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();

        long min = Math.min(n,m);
        long max = Math.max(n,m);
        if(min == 1){
            if(max == 1){
                System.out.println(1);
            }else if(max == 2){
                System.out.println(0);
            }else {
                System.out.println(max-2);
            }
        }else if(min == 2){
            System.out.println(0);
        }else {
            System.out.println((max-2)*(min-2));
        }
    }
}
		