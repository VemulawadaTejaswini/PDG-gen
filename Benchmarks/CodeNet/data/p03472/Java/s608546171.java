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
        int maxb = 0;
        for(int i = 0; i<N; i++) {
            knife[i] = new Knife(sc.nextInt(), sc.nextInt());
            if(max<knife[i].a) {
                max = knife[i].a;
                maxb = knife[i].b;
            }
        }
        knife[N] = new Knife(0,0);
        Arrays.sort(knife,(a, b)->(b.b - a.b));
        int count = 0;
        for(int i = 0; i<N+1; i++) {
            System.err.println(H+" "+knife[i].b+" "+ knife[i].a+" "+max+" "+ maxb);
            if(max > knife[i].b) {
                while(H>0) {
                    H -= max;
                    count++;
                }
                break;
            }
            H -= knife[i].b;
            count++;
            if(H<=0) break;

        }
        System.out.println(count);
    }
}