import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0)
                l.add(i);
        }



        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == 0)
                continue;
            for (int k = 1; k < l.get(i); k++) {
                if (l.get(k) == 0)
                    break;

                if (l.get(i) % 2 == 0 && l.get(k) % 2 == 0) {
                    l.set(i, 0);
                    break;
                }
                if (l.get(i)%k==0) {
                    l.set(i, 0);
                    break;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i));
            if(l.get(i)!=0)
                cnt++;
        }
        System.out.print(cnt+1);
    }
}