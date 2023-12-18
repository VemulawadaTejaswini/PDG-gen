import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int things = sc.nextInt();
        int tickets = sc.nextInt();
        ArrayList<Integer> price = new ArrayList<>(things);
        for(int i=0; i<things; i++){
            price.add(sc.nextInt());
        }
        Collections.sort(price, Comparator.reverseOrder());

        for(int i=0; i<tickets; i++){
            price.set(0,price.get(0)/2);
            sink(price);
        }

        long minimal = 0;
        for(int p : price){
            minimal += p;
        }
        System.out.println(minimal);
    }

    public static void sink(ArrayList<Integer> list){
        if(list.size()==1) return;
        int head = list.get(0);
        int now = 1;
        int size = list.size();
        while(true){
            if(now==size){
                now--;
                break;
            }
            if(head>list.get(now)){
                break;
            }
            now++;
        }
        list.remove(0);
        list.add(now-1,Integer.valueOf(head));
    }
}