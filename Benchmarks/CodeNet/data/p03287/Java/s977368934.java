import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer,Integer> data = new HashMap<>();
        int front=0;
        data.put(0,1);
        for (int i=0;i<n;i++){
            front=(front+sc.nextInt())%m;
            if (data.containsKey(front)){
                data.put(front,data.get(front)+1);
            }else {
                data.put(front,1);
            }
        }
        long ans = 0;
        for (int A : data.keySet()){
            int N = data.get(A);
            ans+=N*(N-1)/2;
        }
        System.out.println(ans);
    }
