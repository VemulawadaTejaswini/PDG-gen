import java.util.*;

public class Main{
        public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int S = Sc.nextInt();

        int h = S / 3600;
        int m = (S % 3600) / 60;
        int s = (S % 3600) % 60;

        System.out.println(h + ":" + m + ":" + s );
    }

}
