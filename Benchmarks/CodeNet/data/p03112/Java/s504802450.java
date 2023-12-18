import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		SC sc = new SC(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int Q=sc.nextInt();
		long[] jinjya=new long[A];
		long[] tera=new long[B];
		for(int i=0; i<A; i++) {
			jinjya[i]=sc.nextLong();
		}
		for(int i=0; i<B; i++) {
			tera[i]=sc.nextLong();
		}
		Arrays.sort(jinjya);
		Arrays.sort(tera);
		for(int i=0; i<Q; i++) {
			long ans=11451419810364364L;
			long start=sc.nextLong();
			long jinjya_higasi=lowerBound(jinjya,start);
			long jinjya_nisi=-114514810364364L;
			long tera_higasi=lowerBound(tera,start);
			long tera_nisi=-114514810364364L;
			if(jinjya_higasi>0 && jinjya_higasi!=-1) {
				int a=(int)jinjya_higasi;
				jinjya_higasi=jinjya[a];
				jinjya_nisi=jinjya[a-1];
			}
			else if(jinjya_higasi==0){
				int a=(int)jinjya_higasi;
				jinjya_higasi=jinjya[a];
			}
			else if(jinjya_higasi==-1) {
				jinjya_nisi=jinjya[A-1];
				jinjya_higasi=114514810364364L;
			}

			if(tera_higasi>0 && tera_higasi!=-1) {
				int a=(int)tera_higasi;
				tera_higasi=tera[a];
				tera_nisi=tera[a-1];
			}
			else if(tera_higasi==0){
				tera_higasi=tera[0];
			}
			else if(tera_higasi==-1) {
				tera_nisi=tera[B-1];
				tera_higasi=114514810364364L;
			}

			//pl("寺西"+tera_nisi);
			//pl("寺東"+tera_higasi);
			//pl("神社西"+jinjya_nisi);
			//pl("神社東"+jinjya_higasi);
			//神社に→　寺に→
			long tmp=0;
			if(tera_higasi>100000000000L || jinjya_nisi>100000000000L) {
				//
			}
			else {
				tmp=Math.max(tera_higasi-start, jinjya_higasi-start);
				ans=Math.min(tmp, ans);
			}


			//神社→　寺←
			if(jinjya_higasi>100000000000L || tera_nisi<0) {
				//
			}
			else {
				tmp=jinjya_higasi-start+jinjya_higasi-tera_nisi;
				ans=Math.min(tmp, ans);
			}


			//寺←　神社→

			if(tera_nisi<0 || jinjya_higasi>100000000000L) {
				//
			}
			else {
				tmp=start-tera_nisi+jinjya_higasi-tera_nisi;
				ans=Math.min(tmp, ans);
			}


			//神社←　寺→
			if(jinjya_nisi<0 || tera_higasi>100000000000L) {
				//
			}
			else {
				tmp=start-jinjya_nisi+tera_higasi-jinjya_nisi;
				ans=Math.min(tmp, ans);
			}


			//寺→　神社←　
			if(tera_higasi>100000000000L || jinjya_nisi<0) {
				//
			}
			else {
				tmp=tera_higasi-start+tera_higasi-jinjya_nisi;
				ans=Math.min(tmp, ans);
			}


			//神社→寺←
			if(jinjya_higasi>100000000000L || tera_nisi<0) {
				//
			}
			else {
				tmp=jinjya_higasi-start+jinjya_higasi-tera_nisi;
				ans=Math.min(tmp, ans);
			}


			//寺←　神社→
			if(tera_nisi<0 || jinjya_higasi>100000000000L) {
				//
			}
			else {
				tmp=start-tera_nisi+jinjya_higasi-tera_nisi;
				ans=Math.min(tmp, ans);
			}


			//神社左寺左
			if(tera_nisi<0 || jinjya_nisi<0) {
				//
			}
			else {
				tmp=Math.max(start-tera_nisi, start-jinjya_nisi);
				ans=Math.min(tmp, ans);
			}

			pl(ans);
			//pl();
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static final int lowerBound(final long[] arr, final long value) {
		int low = 0;
		int high = arr.length;
		int mid;
		while (low < high) {
			mid = ((high - low) >>> 1) + low;    //(low + high) / 2 (オーバーフロー対策)
			if (arr[mid] < value) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		if(low<arr.length) {
			return low;
		}
		else {
			return -1;
		}
	}
}