import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> as = new ArrayList<>();

        for(int i=0; i<N; i++)
            as.add(sc.nextLong());

        // true : Taro
        // false : Jiro
        boolean b = false;
        long nTaro = 0, nJiro = 0;

        // #1 내가 앞 - 상대방의 최대값
        // #2 내가 뒤 - 상대방의 최대값
        // #1 과 #2가 최대값을 선택함

        int i=0, j=N-1;
        while(as.size() > 1) {
            if(b = !b) {
                nTaro += getMyMax(as);
            }
            else {
                nJiro += getMyMax(as);
            }
        }

        if(b = !b) {
            nTaro += as.get(0);
        }
        else {
            nJiro += as.get(0);
        }

        System.out.println(nTaro - nJiro);
    }

    public static long getMyMax(ArrayList<Long> as) {
        long head = as.get(0);
        long tail = as.get(as.size()-1);
        long headMax = head - Math.max(as.get(0+1), as.get(as.size()-1));
        long tailMax = tail - Math.max(as.get(0), as.get(as.size()-1-1));

        long r = 0;

        if(headMax > tailMax) {
            r = as.get(0);
            as.remove(0);
            return r;
        }

        r = as.get(as.size() - 1);
        as.remove(as.size() - 1);
        return r;
    }
}