import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            int price = sc.nextInt();
            int inv = sc.nextInt();
            if(!map.containsKey(price)){
                map.put(price,inv);
            }else{
                int val =  map.get(price);
                map.put(price,val+inv);
            }
        }

        long cost = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int price = e.getKey();
            int num = e.getValue();
            if(num >= M){
                cost += (long)M * price;
                break;
            }else{
                cost += (long)price * num;
                M -= num;
            }
        }
        System.out.println(cost);
    }}