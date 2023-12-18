import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long count_opt =0;
        long price_opt =0;
        ArrayList<Drink> List = new ArrayList<>();
        for(int a=0;a<N;a++){
            long price = sc.nextLong();
            long count = sc.nextLong();
            Drink d = new Drink(price,count);
            List.add(d);
        }
        List.sort(Comparator.comparing(e -> e.price));
        for(Drink d:List){
            if(count_opt+d.count>=M){
                price_opt += (M-count_opt)*d.price;
                break;
            }
            count_opt+=d.count;
            price_opt+=d.count*d.price;
        }
        System.out.println(price_opt);
    }
}

class Drink{
    long price;
    long count;
    public Drink(final long price,final long count){
        this.price = price;
        this.count = count;
    }
}