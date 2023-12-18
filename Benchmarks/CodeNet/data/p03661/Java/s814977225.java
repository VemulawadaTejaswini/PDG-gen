import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int card[] = new int[n];
        int total = 0;
        for (int i = 0;i < n;++i){
            card[i] = scanner.nextInt();
            total += card[i];
        }
        long sub = 0,i2 = total;
        long i3;
        for (int i = 0;i < n;++i){
            sub += card[i] * 2;
            if((i3 = Math.abs(total - sub)) < i2){
                i2 = i3;
            }
            else{
                System.out.println(i2);
                break;
            }
        }

    }


}