import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug == false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int  N;
        int[] pList;
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            pList = new int[N];
            for(int i =0 ; i < N;i++){
                pList[i] = sc.nextInt();
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : pList){
            queue.add(i);
        }
        int h = N /2;
        int under = 0;
        int top = 0;
        for(int i = 0;i < h;i++){
            under = queue.poll();
        }
        top = queue.poll();


        debug(under+"");
        debug(top+"");
        int result = 0;
        if(under <top){
            result = top -under;
        }
        System.out.println(result);

    }

}
