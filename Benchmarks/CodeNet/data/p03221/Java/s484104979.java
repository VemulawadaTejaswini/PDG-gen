import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Shi[] shi = new Shi[m];
        for(int i = 0; i<m; i++) {
            shi[i] = new Shi(sc.nextInt(), sc.nextInt(), i);
        }
        Arrays.sort(shi,(ac, bc)->(ac.b-bc.b));

        int cnt[] = new int[n+1];
        String[] strings = new String[m];

        for(int i = 0; i<m; i++) {
            cnt[shi[i].a]++;
            strings[shi[i].index] = String.format("%06d", shi[i].a) + String.format("%06d", cnt[shi[i].a]);
        }
        for(String s: strings) {
            System.out.println(s);
        }

    }
}
class Shi {
    int a,b,index;
    public Shi(int a, int b, int index) {
        this.a = a;
        this.b = b;
        this.index = index;
    }
}