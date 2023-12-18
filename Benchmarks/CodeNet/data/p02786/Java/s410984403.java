
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long height = (long) Math.ceil (Math.log10(h) / Math.log10(2));

        //System.out.println(height);
        if(isPower(h)){
            height+=1;
        }

        long res = 0;
        for(int i = 0; i< height; i++){
            res += Math.pow(2, i);
        }
        System.out.println(res);
    }



    public static boolean isPower(long n) {
        if (n < 1)
            return false;
        int i = 1;
        while (i <= n) {
            if (i == n)
                return true;
            i <<= 1;

        }
        return false;
    }
}