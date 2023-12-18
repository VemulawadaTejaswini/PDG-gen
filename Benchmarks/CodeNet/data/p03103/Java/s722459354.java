import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        long opt = 0;
        ArrayList<Drink> List = new ArrayList<>();
        for(int a=0;a<N;a++){
            long price = sc.nextLong();
            long count = sc.nextLong();
            Drink d = new Drink(price,count);
            List.add(d);
        }
        Collections.sort(List, new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return o1.price<o2.price? -1:1;
            }
        });

        for(int a=0;a<List.size();a++){
            Drink each = List.get(a);
            long m = each.count;
            if(M-m>0){
                M-=m;
                opt+=each.price*m;
            }
            else if(M-m<=0){
                opt+=each.price*M;
                break;
            }
        }
        System.out.println(opt);
    }
}

class Drink{
    long price;
    long count;
    public Drink(long price,long count){
        this.price = price;
        this.count = count;
    }
}