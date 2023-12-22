import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        int keta;

        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            c = a + b;
            keta = 1;
            while(c >= 10){
                c /= 10;
                keta++;
            }

            System.out.println(keta);
        }

    }
}