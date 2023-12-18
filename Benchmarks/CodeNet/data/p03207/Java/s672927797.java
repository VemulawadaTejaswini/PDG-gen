import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        ans = list.get(N-1) / 2;
        for(int i=0; i<N-1; i++){
            ans += list.get(i);
        }
        System.out.println(ans);
    }
}