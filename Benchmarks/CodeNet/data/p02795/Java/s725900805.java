import java.util.*;

public class Main {

    static int k;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();

        if(h<w){
            k = n/w + 1;
            System.out.println(k);
        }else{
            k = n/h +1;
            System.out.println(k);
        }

    }
}
