import java.util.*;
public class Main1 {
    
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        int n_customer = sc.nextInt();
        
        long sold = sc.nextInt() -1;
        
        int i = 1;
        int price = 2;
        
        while(true){
            int money = sc.nextInt();
            if(money < price)
                i++;
            else if(money == price){
                price++;
                i++;
            }else{
                if(money % price == 0){
                    sold += money / price -1;
                }else{
                    sold += money / price;
                }
                i++;
            }
            if(i == n_customer)
                break;
        }
        System.out.println(sold);
    }
}