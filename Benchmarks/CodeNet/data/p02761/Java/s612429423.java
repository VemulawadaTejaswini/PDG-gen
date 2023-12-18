import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ketasu = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean judge = true;
        int maxKetasu = 0;
        for(int i = 0; i < m; i++){
          int a = sc.nextInt();
          int b = sc.nextInt();
          if(map.containsKey(a) && b != map.get(a)){
            judge = false;
            break;
          }else{
            map.put(a, b);
          }
          if(maxKetasu < a)
            maxKetasu = a;
        }
        if(judge == false)
          System.out.println(-1);
        else if(!map.containsKey(1))
          System.out.println(-1);
        else if(map.get(1) == 0)
          System.out.print(-1);
        else{
          for(int i = 1; i <= Ketasu; i++){
            if(!map.containsKey(i))
              System.out.print(0);
            else
              System.out.print(map.get(i));
          }
        }
        System.out.println();
    }
}
