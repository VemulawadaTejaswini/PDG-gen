import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());

        long tmp = n;
        long count = 1;

        Long kisu = null;
        Long gusu = null;

        if(n % k == 0){
            System.out.println("0");
        }else {
            while (true) {
                long hoge = Math.abs(tmp - k);
                if (hoge <= tmp) {
                    tmp = hoge;
                    if(count % 2 == 0){
                        if(tmp <= k && gusu != null && tmp ==gusu){
                            System.out.println(String.valueOf(Math.min(kisu,gusu)));
                            break;
                        }
                        gusu = hoge;
                    }else{
                        if(tmp <= k && kisu != null && tmp ==kisu){
                            System.out.println(String.valueOf(Math.min(kisu,gusu)));
                            break;
                        }
                        kisu = hoge;
                    }
                } else {
                    break;
                }
                count++;
            }
            System.out.println(tmp);
        }
    }
}
