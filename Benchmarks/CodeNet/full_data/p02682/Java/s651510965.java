import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;

        while(k > 0){
            if(a > 0){
                a--;
                sum++;
            }else if(b > 0){
                b--;
            }else{
                c--;
                sum--;
            }
            k--;
        }

        System.out.println(sum);

    }
}
