import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> templist = new ArrayList<>();
        for(int i = 0;i < n;i++){
            templist.add(sc.nextInt());
        }

        Collections.sort(templist);
        List<Integer> list = new ArrayList<>();
        int h = 0;
        int f = n-1;
        for(int i = 0;i < n;i++){
            if(i % 2 == 0){
                list.add(templist.get(f));
                f--;
            } else {
                list.add(templist.get(h));
                h++;
            }
        }

        List<String> query = new ArrayList<>();
        int ans = list.get(n-2) - list.get(n-1);
        query.add(list.get(n-2) + " " + list.get(n-1));
        for(int i = n-3;i >= 0;i--){
            query.add(list.get(i) + " " + ans);
            ans = list.get(i) - ans;
        }
        System.out.println(ans);
        for(String s : query){
            System.out.println(s);
        }
    }
}

