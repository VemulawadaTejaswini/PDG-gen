import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        ArrayList<Integer> H = new ArrayList<>();
        int candX = 0;
        int candY = 0;
        int candH = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            if(h != 0) {
                X.add(x);
                Y.add(y);
                H.add(h);
                candX = x;
                candY = y;
                candH = h;
            }
        }
        for(int x = 0; x <= 100; x++) {
            for(int y = 0; y <= 100; y++) {
                int height = H.get(0) + Math.abs(X.get(0) - x) + Math.abs(Y.get(0) - y);
                for(int i = 1; i < H.size(); i++) {
                    int tempHeight = H.get(i) + Math.abs(X.get(i) - x) + Math.abs(Y.get(i) - y);
                    if(height != tempHeight) break;
                    if(i == H.size()-1) {
                        System.out.println(x + " " + y + " " + height);
                        return;
                    }
                }
            }
        }
        System.out.println(candX + " " + candY + " " + candH);
    }
}
