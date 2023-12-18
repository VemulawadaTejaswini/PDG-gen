import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> data = new TreeMap<String, Integer>();


        for(int i=1; i<n+1; i++){
            String town = sc.next();
            int point = sc.nextInt();
            data.put(town+(200-point), i);
        }

        for(String nkey: data.keySet()){
            System.out.println(data.get(nkey));
        }

        sc.close();
    }
}