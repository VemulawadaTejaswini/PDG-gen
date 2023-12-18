import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	static private final byte ACODE = (byte)'A';
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		byte[] buf = new byte[1000000+1];
		int[] ans = new int[] {-1,-1,-1};
		int[] cmp = new int[3];
		int[] num = new int[3];
		int[] head = new int[3];
		int[] tail = new int[3];

		int off = 0;
		int len = buf.length;
		int read = 0;
		while((read = System.in.read(buf, off, len))!=-1){
			off+=read;
			len-=read;
		}
		len = off;
		off = 0;

		Arrays.fill(head, Integer.MAX_VALUE);
		buf[len]=buf[len-1];
		len++;
		byte last = buf[0];
		num[last-ACODE] =1;
		head[last-ACODE] = 0;
		tail[last-ACODE] = 0;

		for(int i=1;i<len;i++) {
			if(last == buf[i]) {
				// 先頭で連続していた場合や、3連続の場合。
				if(off == (i-1)) {
					off = i;
					continue;
				}

				check(cmp, buf, off, i, num, head, tail);
				if(ans[0]<cmp[0]) {
					for(int a=0;a<3;a++) {ans[a]=cmp[a];}
				}
				System.err.println(Arrays.toString(ans));
				off = i;
				Arrays.fill(num, 0);
				Arrays.fill(head, Integer.MAX_VALUE);
				Arrays.fill(tail, 0);
				num[last-ACODE] =1;
				head[last-ACODE] = i;
				tail[last-ACODE] = i;
			}else {
				last = buf[i];
				num[last-ACODE]++;
				head[last-ACODE] = Math.min(head[last-ACODE], i);
				tail[last-ACODE] = Math.max(head[last-ACODE], i);
			}
		}
		out.println(new String(buf, ans[1], ans[2]));
	}
	public static void check(int[] cmp, byte[] buf, int off, int end, int[] num, int[] head, int[] tail) {
		System.err.println(off+"/"+end);
		System.err.println(Arrays.toString(num));
		System.err.println(Arrays.toString(head));
		System.err.println(Arrays.toString(tail));
		if(num[0]==num[1]&&num[1]==num[2]) {
			cmp[0] = num[0];
			cmp[1] = off;
			cmp[2] = end;
		}
		if(num[0]==0||num[1]==0||num[2]==0) {
			cmp[0] = 0;
			return;
		}
		int min = min(num);
		System.err.println(min);
		int headIndex = head[min];
		int tailIndex = tail[min];
		cmp[0] = num[min];
		if(headIndex - off >= 2) {
			cmp[1] = headIndex-2;
			cmp[2] = tailIndex;
			return;
		}
		if(end - tailIndex >= 2) {
			cmp[1] = headIndex;
			cmp[2] = tailIndex+2;
			return;
		}
		cmp[1] = headIndex-1;
		cmp[2] = tailIndex+1;
		return;
	}
	public static int min(int[] num) {
		int min = -1;
		if(num[0]<num[1]) {
			if(num[0]<num[2]) {
				min = 0;
			}else {
				min = 2;
			}
		}else {
			if(num[1]<num[2]) {
				min = 1;
			}else {
				min = 2;
			}
		}
		return min;
	}
}
