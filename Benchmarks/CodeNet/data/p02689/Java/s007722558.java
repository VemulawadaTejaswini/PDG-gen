
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mapAns = new HashMap<Integer, Integer>();

        for(int i=1;i<=n;i++){
            int h = sc.nextInt();
            map.put(i, h);
            mapAns.put(i, 1);
        }
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ah = map.get(a);
            int bh = map.get(b);
            if(ah > bh){
                mapAns.put(b, 0);
            }else if(ah < bh){
                mapAns.put(a, 0);
            }else{
                mapAns.put(a, 0);
                mapAns.put(b, 0);
            }
        }
        sc.close();
        for(int ans : mapAns.values()){
            if(ans == 1){
                sum++;
            }
        }
        System.out.println(sum); 
    }
}
