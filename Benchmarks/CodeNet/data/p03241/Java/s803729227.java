import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i = 1;i <= m/2;i++){
            if(m % i == 0){
                list.add(i);
            }
        }
        list.add(m);

        for(int i = list.size()-1;i >= 0;i--){
            int x = list.get(i);
            int t = m/x;
            if(t >= n){
                System.out.println(x);
                break;
            }
        }

    }
}
