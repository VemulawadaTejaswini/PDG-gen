import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        String blank = sc.nextLine();
        String[] a = sc.nextLine().split(" ");

        long count = 0;
        int now = 1;
        String next = "1";

        Set stack = new HashSet<String>();
        while(count <= k){
            if(count > 0) {stack.add(next);};
            now = Integer.parseInt(next);
            next = a[now - 1];

            if(stack.contains(String.valueOf(now))){
                break;
            }
            count++;
        }

        if(count < k){
            long nokori = k % count;
            for(long i = 0; i < nokori; i++){
                now = Integer.parseInt(next);
                next = a[now - 1];
            }
        }
        System.out.println(next);
    }
}