import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final int M = Integer.parseInt(sc.next());
        final int[] map = new int[100000000+1];
        for(int i = 1; i<=N; i++){
            final int a = Integer.parseInt(sc.next());
            final int b = Integer.parseInt(sc.next());
            map[a]+=b;
        }
        int cost = 0;
        int remaining = M;
        for (int up = 0; up < map.length && remaining!=0; up++) {
            final int stock = map[up];
            if(remaining >= stock){
                remaining -= stock;
                cost += stock*up;
            }else{
                cost += remaining * up;
                remaining = 0;
            }
        }
        System.out.println(""+cost);
    }
}
