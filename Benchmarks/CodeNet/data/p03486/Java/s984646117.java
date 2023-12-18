import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char ca[] = scanner.next().toCharArray();
        char cb[] = scanner.next().toCharArray();
        Arrays.parallelSort(ca);
        Arrays.parallelSort(cb);
        for (int i = 1;i <= ca.length;++i){
            if(cb.length - i < 0){
                continue;
            }
            if(ca[ca.length - i] > cb[cb.length - i]){
                System.out.println("No");
                return;
            }
            else if(ca[ca.length - i] < cb[cb.length - i]){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}