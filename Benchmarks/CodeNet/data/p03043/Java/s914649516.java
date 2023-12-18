import java.util.*;
import java.math.BigDecimal;

public class Main {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        Map<Integer, Integer> diceResult = new HashMap<>();
        for(int i=1;i<=N;i++){
            // System.out.println("i="+i+" K="+K+" y="+Math.log((double)K/(double)i) / Math.log(2.0));
            
            if(i >= K){
                if(!diceResult.containsKey(0)){
                    diceResult.put(0, 0);
                }
                diceResult.put(0, diceResult.get(0) + 1);
            }else{
                // 何回連続で表を出せば得点を超えるかという数
                int num = (int)Math.ceil( Math.log((double)K/(double)i) / Math.log(2.0) );
                if(!diceResult.containsKey(num)){
                    diceResult.put(num, 0);
                }
                diceResult.put(num, diceResult.get(num) + 1);
            }
        }
        System.out.println(diceResult);
        
        
        
        
        BigDecimal pb = new BigDecimal(0.0);
        if(diceResult.containsKey(0)){
            pb = new BigDecimal(diceResult.get(0)).divide(new BigDecimal(N));
            diceResult.remove(0);
        }
        for(Map.Entry<Integer,Integer> e : diceResult.entrySet()){
            pb = pb.add( new BigDecimal("0.5").setScale(13,BigDecimal.ROUND_HALF_UP)
                .pow(e.getKey()).multiply(new BigDecimal(e.getValue()).setScale(13,BigDecimal.ROUND_HALF_UP)
                .divide(new BigDecimal(N).setScale(13,BigDecimal.ROUND_HALF_UP)
            ))).setScale(13,BigDecimal.ROUND_HALF_UP);
            System.out.println(pb.doubleValue());
            // pb += Math.pow(0.5,(double)e.getKey() ) * ( (double)e.getValue() / (double)N);
        }
        
        System.out.println(String.format("%.12f",pb.doubleValue()));
        
    }
}
