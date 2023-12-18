import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[1000000000];
        for (int i=0;i<n;i++){
            number[scanner.nextInt()]++;
        }
        int count = 0;
        for (int i=0;i<1000000000;i++){
            if (number[i]%2==1){
                count++;
            }
        }
        System.out.println(count);

    }

}