import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<Double>();
        int enemys = sc.nextInt();
        int t = sc.nextInt();
        long total = 0;
        if(enemys <= t){
            System.out.println(0);
        }else{
            for(int i = 0;i < enemys;i++){
                list.add(sc.nextDouble());
            }
            
            Collections.sort(list,Collections.reverseOrder());
            
            for(int i = 0; i < t; i++){
                list.remove(i);
            }
                
            for(int i = 0;i < list.size();i++){
                total += list.get(i);
            }
            System.out.println(total);
        }
    }
}
