import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        int max=0;
        for(int a=0;a<N;a++){
            int price = sc.nextInt();
            if(max<price) max = price;
            sum+=price;
        }
        sum = sum-(max/2);
        System.out.println(sum);
    }
}
