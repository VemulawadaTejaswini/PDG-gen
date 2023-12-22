import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt() + 1;
        int sum = 0;
        int c = scan.nextInt();
        for(int i = 0; i < c; i++){
            sum += scan.nextInt();
        }
        System.out.println(sum % n == 0 ? sum / n : sum / n + 1);
        scan.close();
    }
}
