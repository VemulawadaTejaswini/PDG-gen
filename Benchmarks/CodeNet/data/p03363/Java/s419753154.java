import java.util.HashMap;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = readInt();

        long acc = 0L;

        HashMap<Long, Long> mp = new HashMap<>();
        mp.put((long)0, (long)1);

        for(int i=0; i<N; i++){
            long num = readLong();
            acc +=  num;

            if(mp.containsKey(acc)){
                long tmp = mp.get(acc);
                tmp += 1;
                mp.put(acc, tmp);
            }else{
                mp.put(acc, (long)1);
            }
        }

        long cnt = 0;

        for(long key: mp.keySet()){
            long tmpCnt = mp.get(key);
            cnt += Comb(tmpCnt);
        }

        System.out.println(cnt);
    }

    private static long Comb(long tmpCnt) {
        if(tmpCnt == 1){
            return 0;
        }else{
            return tmpCnt * (tmpCnt - 1) / 2;
        }
    }

    private static int readInt(){
        return Integer.parseInt(sc.next());
    }

    private static long readLong(){
        return Long.parseLong(sc.next());
    }

}