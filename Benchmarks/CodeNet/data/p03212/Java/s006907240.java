import java.util.*;
class Main{
    static long n;
    static HashSet<String> set;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        set = new HashSet<>();
        dfs("357");
        dfs("375");
        dfs("537");
        dfs("573");
        dfs("735");
        dfs("753");
        System.out.println(set.size());
    }
    public static void dfs(String cur){
        String[] target = {"3","5","7"};
        long num = Long.parseLong(cur);
        if(num <= n){
            set.add(cur);
            for(int i = 0; i < cur.length(); i++){
                for(int j = 0; j < 3; j++){
                    dfs(cur.substring(0,i) + target[j] + cur.substring(i));
                }
            }
        }
    }
}

