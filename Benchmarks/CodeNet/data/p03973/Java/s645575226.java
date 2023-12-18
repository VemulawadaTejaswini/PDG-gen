import java.util.*;
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        int n_customer = sc.nextInt();
        int[] moneys = new int[n_customer];
        
        for(int i = 0;i<n_customer;i++){
            moneys[i] = sc.nextInt();
        }
        
        int sold = moneys[0] - 1;
        moneys[0] = 1;
        
        int i = 1;
        int price = 2;
        
        while(true){
            if(moneys[i] < price)
                i++;
            else if(moneys[i] == price){
                price++;
            }else{
                if(moneys[i] % price == 0){
                    sold += moneys[i] / price -1;
                }else{
                    sold += moneys[i] / price;
                }
                i++;
            }
            if(i == n_customer)
                break;
        }
        System.out.println(sold);
    }
}