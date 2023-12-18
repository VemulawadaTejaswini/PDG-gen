import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
      	int H = sc.nextInt();
      	int W = sc.nextInt();
      	String[] A = new String[H];
      	char[][] a = new char[H][W];
      	for(int i = 0; i < H; i++){
          	A[i] = sc.next();
        }
      	for(int i =0; i < H; i++){
          	a[i] = A[i].toCharArray();
        }
      	System.out.println("Impossible");
	}
}