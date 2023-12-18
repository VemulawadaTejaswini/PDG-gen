import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double price;
        price = N/1.08;
        if(Math.floor(price*1.08) == N){
            System.out.println((int)price);
        }else{
            System.out.println(":(");
        }
 }
}