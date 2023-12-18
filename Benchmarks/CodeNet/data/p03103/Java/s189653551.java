import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Drink[] d = new Drink[n];
        for(int i = 0; i < n; i++){
            d[i] = new Drink(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        Arrays.sort(d);
        
        long ans = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if((count + d[i].number) >= m){
                ans += d[i].price * (m - count);
                break;
            }else{
                ans += d[i].price * d[i].number;
                count += d[i].number;
            }
        }
        
        System.out.println(ans);
    }
}

class Drink implements Comparable<Drink>{
    long price;
    int number;
    
    Drink(int price, int number){
        this.price = price;
        this.number = number;
    }

    @Override
    public int compareTo(Drink d) {
        
        if(this.price < d.price){
            return -1;
        }else if(this.price > d.price){
            return 1;
        }else{
            return 0;
        }
    }
}