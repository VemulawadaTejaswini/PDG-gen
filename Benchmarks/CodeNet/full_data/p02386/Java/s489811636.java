import java.io.IOException;
class Main {
	static final int[] C = {
		0,1,2,0,2,4,0,3,1,0,4,3,1,0,3,1,2,0,1,3,5,1,5,2,
		2,0,1,2,1,5,2,4,0,2,5,4,3,0,4,3,1,0,3,4,5,3,5,1,
		4,0,2,4,2,5,4,3,0,4,5,3,5,1,3,5,2,1,5,3,4,5,4,2
	};
	byte[] b = new byte[4096];
	int p;
	int r() {
		for (; b[p] < 0x30 || b[p] > 0x39; p++);
		int v = 0;
		for (; b[p] >= 0x30; ) v = 10 * v + b[p++] - 0x30;
		return v;
	}
	public static void main(String[] args) throws IOException {
		Main r = new Main();
		System.in.read(r.b, 0, r.b.length);
		int[] d = new int[6 + r.r() * 6];
		for (int i = 6; i < d.length; i++) {
			d[i] = r.r();
		}
		for (int p = 6; p < d.length; p += 6) {
			for (int c = 0; c < C.length; c += 3) {
				d[0]=d[p+C[c+0]];d[3]=d[p+5-C[c+2]];
				d[1]=d[p+C[c+1]];d[4]=d[p+5-C[c+1]];
				d[2]=d[p+C[c+2]];d[5]=d[p+5-C[c+0]];
				for (int q = p + 6; q < d.length; q += 6) {
					if (d[0]==d[q+0]&&d[1]==d[q+1]&&d[2]==d[q+2]&&
						d[3]==d[q+3]&&d[4]==d[q+4]&&d[5]==d[q+5]) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}

