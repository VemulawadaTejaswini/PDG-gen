import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for(int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n ; i++) {
            int sum = 0;
            for(int d = 0; d < n ; d++) {
                if( d % 2 == 0) {
                    sum += a[ (i+d)%n ];
                } else {
                    sum -= a[ (i+d)%n ];
                }
            }
            q.add(sum);
        }
        show(q);
    }
    
    static void show(Queue<Integer> q) {
        String space = " ";
        StringBuilder sb = new StringBuilder();
        while(true) {
            sb.append( String.valueOf(q.poll()) );
            if(q.isEmpty()) break;
            sb.append(space);
        }
        System.out.println(sb.toString());
    }
}