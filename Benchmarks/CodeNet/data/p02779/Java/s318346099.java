import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        boolean b = true;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(m.containsKey(a)){
                b = false;
                break;
            }else{
                m.put(a, a);
            }
        }
        System.out.println(b ? "YES":"NO");

    }
}
