import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private int h;
    private int w;
    private int k;
    private final long mod = 1_000_000_007L;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.solve();
    }

    private void set() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
		String[] p = br.readLine().split(" ");
		h = Integer.parseInt(p[0]);
		w = Integer.parseInt(p[1]);
		k = Integer.parseInt(p[2]);
	} catch(IOException e) {
	    e.printStackTrace();
	}
    }
    
    private void solve() {
	set();
	long[][] a = new long[h+1][w+2];
	a[0][1] = 1;
	long[] f = new long[w+2];
	f[0] = 0; f[1] = f[2] = 1;
	for (int i=3;i<w+2;i++) f[i] = f[i-1] + f[i-2];
	for (int i=1;i<h+1;i++) for (int j=1;j<w+1;j++) a[i][j] = (f[j-1]*f[w-j+1]*a[i-1][j-1]%mod + f[j]*f[w-j+1]*a[i-1][j]%mod + f[j]*f[w-j]*a[i-1][j+1]%mod) % mod;
	System.out.println(a[h][k]);
    }

}