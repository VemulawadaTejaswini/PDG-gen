import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);

    void run(){
	// 高さと、対角線のセットを作成
	int[][] a = new int[23000][2];
	// ↑ 0:高さ、1:幅
	int k = 0;
	for(int i=1; i<=150; i++){  // 高さ
	    for(int j=i+1; j<=150; j++){ // 幅
		a[k][0] = i;
		a[k][1] = j;
		k++;
	    }
	}

	Arrays.sort(a, new Comparator<int[]>(){
		public int compare(int[]a, int[]b){
		    int x1 = a[0]*a[0]+a[1]*a[1];
		    int x2 = b[0]*b[0]+b[1]*b[1];
		    if(x1 != x2) return x1-x2;
		    else return a[0]-b[0];
		}
	    }
	    );


	while(kbd.hasNext()){
	    int h = kbd.nextInt();
	    int w = kbd.nextInt();
	    if(h!=0 && w!=0) solve(h, w, a);
	}
    }

    void solve(int h, int w, int[][] a){
	int t = h*h+w*w;
	int i=0;
	while((h!=a[i][0] || w!=a[i][1])) i++;
	System.out.println(a[i+1][0]+" "+a[i+1][1]);
    }
}
	    