import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long k = Long.parseLong(in.nextLine());
        // String[] tmp = in.nextLine().trim().split("\\s");
        // int a = Integer.parseInt(tmp[0]);
        // int b = Integer.parseInt(tmp[1]);
        in.close();
        int i = 0;
        long base = 100;
        while(base < k){
            long inc = (long)(base * 0.01);
            base += inc;
            i++;
        }
        System.out.println(i);
    }
}