import java.util.*;
class Knife {
    int a,b;
    public Knife(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        Knife[] knife = new Knife[N+1];
        int max = 0;
        for(int i = 0; i<N; i++) {
            knife[i] = new Knife(sc.nextInt(), sc.nextInt());
            max = Math.max(knife[i].a, max);
        }
        knife[N] = new Knife(0,0);
        Arrays.sort(knife,(a, b)->(b.b - a.b));
        int count = 0;
        for(int i = 0; i<N; i++) {
            if(max > knife[i+1].b) {
                while(H-knife[i].b>0) {
                    H -= knife[i].a;
                    count++;
                }
                if(H>0) count++;
                break;
            }
            H -= knife[i].b;
            count++;
            if(H<=0) break;
        }
        System.out.println(count);
    }
}