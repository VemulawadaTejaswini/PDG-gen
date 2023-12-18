import java.util.*;

public class Main{
    final static long mod = 1000000007;
    //
    static ArrayList<intPair>[] list;
    static long[] distance;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        distance = new long[n];
        list = new ArrayList[n];
        for(int i = 0; i < n; i++){
          list[i] = new ArrayList<intPair>();
        }

        for(int i = 0; i < n - 1; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            list[a].add(new intPair(b, c));
            list[b].add(new intPair(a, c));
        }
        int q = sc.nextInt();
        int k = sc.nextInt() - 1;
        dfs(k, -1);

        for(int i = 0; i < q; i++){
            System.out.println(distance[sc.nextInt() - 1] + distance[sc.nextInt() - 1]);
        }

    }
    public static void dfs(int current, int parent){
        for(intPair pair : list[current]){
            if(pair.getKey() != parent){
                distance[pair.getKey()] = distance[current] + pair.getValue();
                dfs(pair.getKey(), current);
            }
        }
    }
}

//
class intPair{
    int key;
    int value;
    public intPair(int key , int value){
        this.key = key;
        this.value = value;
    }
    int getKey(){
        return key;
    }
    int getValue(){
        return value;
    }
}