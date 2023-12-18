import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        boolean f = false;
        for(int i = 3; i<=55555; i=i+2) {
            f = false;
            for(int j = 2; j*j<=i;j++) {
                if(i%j == 0) {
                    f=false;
                    break;
                }else f=true;
            }
            if(f && i%5==1) queue.add(i);
        }
        for(int i = 0; i<n; i++) {
            System.out.println(queue.poll());
        }

    }
}