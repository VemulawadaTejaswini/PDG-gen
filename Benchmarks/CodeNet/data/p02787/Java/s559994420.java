import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static HashMap<Long,Long> data;



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hp = sc.nextInt();
        N = sc.nextInt();
        long attack[] = new long[N];
        long magic[] = new long[N];
//        attack[] = new int[N];
//        magic[] = new int[N];
        for (int i =0;i<N;i++){
            attack[i] = sc.nextInt();
            magic[i] = sc.nextInt();
        }
        data = new HashMap<>();
        System.out.println(HP(hp,attack,magic));
    }

    public static Long HP(long hp,long[] attack ,long[] magic){
        if(hp<=0){
            return Long.parseLong("0");
        }
        if(data.containsKey(hp)){
            return data.get(hp);
        }else {
            Long min = Long.MAX_VALUE;
            for(int i = 0; i< N;i++){

                min = Math.min(min,HP(hp-attack[i],attack,magic)+magic[i]);

            }
            data.put(hp,min);
//            System.out.println(min);
//            System.out.println(ii);
            return min;
        }
    }
}
