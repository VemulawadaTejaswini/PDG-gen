import java.util.Scanner;

public class Main {
    static int n;
    static Circle circle[] = new Circle[24];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            n = sc.nextInt();
            if (n==0) break;

            for (int i = 0; i < n; i++) {
                circle[i] = new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                overCircle(i);
            }

            System.out.println(remove(0));
        }
    }

    static void overCircle(int i) {
        for (int j = 0; j < i; j++) {
            int l = (int)(Math.pow(circle[j].x-circle[i].x,2)+Math.pow(circle[j].y-circle[i].y,2));
            if (Math.pow(circle[j].r+circle[i].r,2)>l){
                circle[i].over[j] = 1;
                circle[i].cnt++;
            }
        }
    }

    static int remove(int num) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (circle[i].flag==1) continue;
            for (int j = i+1; j < n; j++) {
                if (circle[j].cnt==0&&circle[i].c==circle[j].c){
                    cnt += 2;
                    for (int k = 0; k < n; k++) {
                        if (circle[i].over[i]==1) cnt--;
                    }
                }
            }
        }
        return cnt;
    }

    static class Circle{
        int x, y, r, c;
        int[] over = new int[24];
        int cnt = 0, flag = 0;
        Circle(int s, int t, int u, int v){
            x = s; y = t; r = u; c = v;
        }
    }
}