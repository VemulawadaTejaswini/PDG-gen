import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int allNum=scan.nextInt();
        HashMap<Long,Long> bigger=new HashMap<>();
        HashMap<Long,Long> smaller=new HashMap<>();
        for (long i = 1; i <=allNum ; i++) {
            long A=scan.nextLong();
            if (bigger.containsKey(i+A)){
                bigger.put(i+A,bigger.get(i+A)+1);
            }else{
                bigger.put(i+A,1L);
            }
            if (smaller.containsKey(i-A)){
                smaller.put(i-A,smaller.get(i-A)+1);
            }else{
                smaller.put(i-A,1L);
            }
        }
        long count=0;
        for(Long i:bigger.keySet()){
            if (smaller.containsKey(i)){
                count+=bigger.get(i)*smaller.get(i);
            }
        }
        System.out.println(count);
    }
}
