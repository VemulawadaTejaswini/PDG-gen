import java.util.*;


public class Main {
    static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        int min = 0;
        int max = 0;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i < n; i++){
            int na = sc.nextInt();
            if (na < min) {
                min = na;
                minIndex = i;
            }else if(na > max) {
                max = na;
                maxIndex = i;
            }
            a.add(na);
        }
        ArrayList<String> ans = new ArrayList<>();

        if(Math.abs(max) > Math.abs(min)){
            for(int i = 0; i < n; i++){
                if(a.get(i) < 0){
                    ans.add(String.valueOf(maxIndex+1) + " " + String.valueOf(i+1));
                }
            }
            for(int i = 0; i < n-1; i++){
                ans.add(String.valueOf(i+1) + " " + String.valueOf(i+2));
            }
        }else{
            for(int i = 0; i < n; i++){
                if(a.get(i) > 0){
                    ans.add(String.valueOf(minIndex+1) + " " + String.valueOf(i+1));
                }
            }
            for(int i = n-1; i >= 1; i--){
                ans.add(String.valueOf(i+1) + " " + String.valueOf(i));
            }
        }

        System.out.println(ans.size());
        for(String s : ans){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
