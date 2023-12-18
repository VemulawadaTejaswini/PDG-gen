import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final long K = sc.nextLong();
        int[] teleport = new int[N];
        for(int i=0; i<N; i++) {
            teleport[i]=sc.nextInt()-1;
        }

        boolean[] clear = new boolean[N];

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);

        int twice = -1;

        for(int i=0; i<K; i++) {
            int x= teleport[list.get(i)];
            if(clear[x]) {
                twice = x;
                break;
            }else {
                list.add(x);
                clear[x] = true;
            }
        }

        int num =0;
        if(twice==-1) {
            System.out.println(teleport[list.get((int) (K))]);
        }else {
            while(list.size()>0) {
                if(list.get(0)==twice) {
                    break;
                }else {
                    list.remove(0);
                    num++;
                }
            }
            System.out.println(list.get((int)((K-num)%list.size()))+1);
        }
    }

}
