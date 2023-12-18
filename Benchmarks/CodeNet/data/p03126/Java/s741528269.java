import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int number[] = new int[30];

        for(int i = 0;i<n;i++){
            int tmp = sc.nextInt();
            for(int j = 0;j<tmp;j++){
                number[sc.nextInt()]++;
            }
            sc.nextLine();
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            if(number[i] == n){
                count++;
            }
        }
        System.out.println(count);
    }
}