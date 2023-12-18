import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
        sc.close();
    }
    
	//フィールド
    Scanner sc;
    int W;
    int H;
    int N;
    int[] x;
    int[] y;
    int[] a;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        this.W = sc.nextInt();
        this.H = sc.nextInt();
        this.N = sc.nextInt();
        x = new int[N];
        y = new int[N];
        a = new int[N];
        for (int i=0; i<N; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        	a[i] = sc.nextInt();
        }
    }
    
    //解答処理
    private int solve() {
        int answer = 0;
        
        int lx = 0; //長方形左下のx座標
        int ly = 0; //長方形左下のy座標
        int rx = W; //長方形右上のx座標
        int ry = H; //長方形右上のy座標
        //右下と左上は(W,0)、(0,H)
        
        for(int i=0; i<N; i++){
          if(a[i] == 1){ //x[i]>xの領域を塗りつぶす
            lx = Math.max(lx, x[i]);
          }else if(a[i] == 2){ //x[i]<xの領域を塗りつぶす
            rx = Math.min(rx, x[i]);
          }else if(a[i] == 3){ //y[i]>yの領域を塗りつぶす
            ly = Math.max(ly, y[i]);
          }else if(a[i] == 4){ //y[i]<yの領域を塗りつぶす
            ry = Math.min(ry, y[i]);
          }
        }
        
        answer = (rx-lx) * (ry-ly);
        if (answer < 0) {
        	answer = 0;
        }
        return answer;
    }
    
    //出力
    public void show(int answer) {
        System.out.println(answer);
    }

}
