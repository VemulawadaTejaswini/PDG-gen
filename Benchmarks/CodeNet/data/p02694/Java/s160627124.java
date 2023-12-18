import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long target = sc.nextLong();
        float mon = 100.0f;
        for(int i = 0;;i++){
            if(mon>target){
                System.out.println(i);
                break;
            }
            mon = mon*1.01f;
        }
    }
}