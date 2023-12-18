import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ll.add(sc.nextInt());
        }
        HashSet<Edge2> hs = new HashSet<>();
        Collections.sort(ll);
        long ans = 0;
        for(int i = n-1; i >= 0; i--){
            int big = ll.get(i);
            for(int j = i-1; j >= 0; j--){
                int small = ll.get(j);
                Edge2 e2 = new Edge2(big,small);
                if(hs.contains(e2)){
                    continue;
                }
                int res = Collections.binarySearch(ll, big-small+1);
                //System.out.println(i + " " + j + " " + (big-small+1) + " " + res);
                res = res >= 0 ? res : ~res;
                ans += res < j ? j-res : 0;
            }
        }
        System.out.println(ans);
    }
}

class Edge2{
    int a;
    int b;
    public Edge2(int a, int b){
        this.a = a;
        this.b = b;
    }
}
