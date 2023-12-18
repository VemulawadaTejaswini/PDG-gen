import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> poses = new ArrayList<>();
        poses.add(x);
        for (int i = 0;i < n;++i){
            poses.add(sc.nextInt());
        }
        poses.sort(Comparator.comparingInt(a -> a));
        int m = poses.get(1) - poses.get(0);
        for (int i = 1;i < n;++i){
            int p = poses.get(i + 1) - poses.get(i);
            while (m != p){
                if(m > p)m = m - p;
                else p = p - m;
            }
            if(m == 1){
                System.out.println(1);
                return;
            }
        }
        System.out.println(m);
    }

}


