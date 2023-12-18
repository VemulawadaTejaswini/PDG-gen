import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            int input = sc.nextInt();
            a.add(input);
        }
        for(int i = 0;i < m;i++){
            int maxIndex = a.indexOf(Collections.max(a));
            a.set(maxIndex, a.get(maxIndex)/2);
        }
        long ans = 0;
        for(int i = 0;i < a.size();i++){
            ans += a.get(i);
        }
        System.out.println(ans);
    }
}