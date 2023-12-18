import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			solve();
  }

	public static void solve() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int h = sc.nextInt();
				int w = sc.nextInt();
				int n = sc.nextInt();
				int[] a = new int[n];
				for(int i = 0; i < n; i++){
					a[i] = sc.nextInt();
				}
				sc.close();
				
				int[][] ans = new int[h][w];
				int nowh = 0, noww = 0, nowa = 0;
				for(int i = 0; i < h * w; i++){
					ans[nowh][noww] = nowa+1;
					a[nowa]--;
					if(a[nowa] == 0) nowa++;
					if(nowh % 2 == 0){
						if(noww == w-1){
							nowh++;
						}else{
							noww++;
						}
					}else{
						if(noww == 0){
							nowh++;
						}else{
							noww--;
						}
					}

				}
				for(int i = 0; i < h; i++){
					for(int j = 0; j < w; j++){
						out.print(ans[i][j]);
						if(j != w-1) out.print(" ");
					}
					out.println();
				}
        out.flush();
	}
}