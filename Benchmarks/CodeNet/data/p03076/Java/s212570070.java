import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        for(int i = 0; i < 5; i++){
            dishes.add(new Dish(sc.nextInt()));
        }
        Collections.sort(dishes, (a,b) -> a.mod10 - b.mod10);
        int ans = 0;
        int i = 0;
        for(Dish d : dishes){
            ans += d.t;
            if(i != 4){
                ans += d.mod10;
            }
            i++;
        }
        System.out.println(ans);
    }
}

class Dish{
    int t, mod10;
    public Dish(int t){
        this.t = t;
        mod10 = (10 - (t%10)) % 10;
    }
}
