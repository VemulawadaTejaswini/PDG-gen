import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        
        int a = (price+1000-1)/1000;
        int r = a*1000 - price;
        System.out.println(r);
        
//        if(price < 1000) {
//            System.out.println(price);
//        } else {
//            int surplus = price % 1000;
//            int change  = 1000 - surplus;
//            System.out.println(change);
//        }
    }
}