import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, Integer> b = new HashMap<String, Integer>();
        List<String> a = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            String s = sc.next();
            if(b.containsKey(s)) b.put(s, b.get(s) +1);
            else{
                b.put(s, 1);
                a.add(s);
            }
        }
        int M = sc.nextInt();
        for(int i = 0; i < M; i++){
            String s = sc.next();
            if(b.containsKey(s)) b.put(s, b.get(s) -1);
        }
        int ans = 0;
        for(String s : a){
            ans = Math.max(ans, b.get(s));
        }
        System.out.println(ans);
        sc.close();

    }

}
