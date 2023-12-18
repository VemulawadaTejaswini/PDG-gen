import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int kosuu = sc.nextInt();
        int ninki = sc.nextInt();
        int sousuu = 0;
        List<Integer> syouhin = new ArrayList();
        for(int i = 0;i < kosuu;i++){
            int k = sc.nextInt();
            syouhin.add(k);
            sousuu += k;
        }
        syouhin.sort(Comparator.reverseOrder());
        int flag = 0;
        for(int i = 0;i < ninki;i++){
            int j = syouhin.get(i);
            System.out.println(j);
            if(j < 4*ninki){
                flag += 0;
            }else{
                flag += 1;
            }
        }
        if(flag == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
