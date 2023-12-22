import java.util.*;

public class Main{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        long k = sc.nextLong();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt() - 1;

        int[] move = new int[n];
        Arrays.fill(move, -1);

        List<Long> list = new ArrayList<>();

        int cle = 1;
        int b = 0;
        int v = 0;
        while (move[v] == -1) {
            move[v] = list.size();
            list.add((long)v);
            v = arr[v];
        }

        cle = list.size() - move[v];
        b = move[v];

//        System.out.println(cle);
//        System.out.println(b);
//        System.out.println(list);

        if (k < b) {
            System.out.println(list.get((int)k) + 1);
        } else {
            long rem = (k - b) % cle;
//            System.out.println((int)(b + rem));
            System.out.println(list.get((int)(b + rem)) + 1);
        }


    }


}
