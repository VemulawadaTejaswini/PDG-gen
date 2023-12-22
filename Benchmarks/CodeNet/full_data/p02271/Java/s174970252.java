
import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        BitSet bitSet = new BitSet(2000);
        for(int i=0;i<n;i++){
            Integer m = fs.nextInt();
            bitSet.set(m);
            for (Object k:deque){
                bitSet.set((Integer)k+m);
            }
            deque.add(m);
        }
        int q = fs.nextInt();
        for (int i=0;i<q;i++){
           sb.append( bitSet.get(fs.nextInt())?"yes\n":"no\n");
        }
        System.out.print(sb.toString());
    }
 
}


