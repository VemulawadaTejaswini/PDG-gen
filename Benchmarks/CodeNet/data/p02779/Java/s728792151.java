import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Boolean> map = new HashMap<>();
        String ans = "Yes";
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            if(map.get(num) == null){
                map.put(num, true);
            }else{
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}