import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();


		ArrayList<Long> a_books = new ArrayList<Long>(N);
		for (int i = 0; i < N; i++) {
			a_books.add(sc.nextLong());
		}
		ArrayList<Long> b_books = new ArrayList<Long>(M);
		for (int i = 0; i < M; i++) {
			b_books.add(sc.nextLong());
		}

		int ans = 0;
		long total = 0L;
		int a_book_size = a_books.size();
		int b_book_size = b_books.size();
		int a_book_count = 0;
		int b_book_count = 0;

		while (total <= K) {
			long a_book_time = -1;
			long a_book_next_time = -1;
			if (a_book_count < a_book_size) {
				a_book_time = a_books.get(a_book_count);

			}
			if (a_book_count+1 < a_book_size) {
				a_book_next_time = a_books.get(a_book_count);

			}
			long b_book_time = -1;
			long b_book_next_time = -1;
			if (b_book_count < b_book_size) {
				b_book_time = b_books.get(b_book_count);
			}
			if (b_book_count+1 < b_book_size) {
				b_book_next_time = b_books.get(b_book_count);
			}

			if (a_book_time != -1 && a_book_time != -1) {
				if (a_book_next_time != -1 && b_book_next_time != -1) {
					if (a_book_time + a_book_next_time < b_book_time + b_book_next_time) {
						if (total + a_book_time <= K) {
							a_book_count++;
							total += a_book_time;
							ans++;
						}
						else {
							break;
						}
					}
					else {
						if (total + b_book_time <= K) {
							b_book_count++;
							total += b_book_time;
							ans++;
						}
						else {
							break;
						}
					}
					
				}
				else if (a_book_next_time != -1) {
					if (a_book_time + a_book_next_time < b_book_time) {
						if (total + a_book_time <= K) {
							a_book_count++;
							total += a_book_time;
							ans++;
						}
						else {
							break;
						}
					}
					else {
						if (total + b_book_time <= K) {
							b_book_count++;
							total += b_book_time;
							ans++;
						}
						else {
							break;
						}
					}
				}
				else if (b_book_next_time != -1) {
					if (b_book_time + b_book_next_time < a_book_time ) {
						if (total + b_book_time <= K) {
							b_book_count++;
							total += b_book_time;
							ans++;
						}
						else {
							break;
						}
					}
					else {
						if (total + b_book_time <= K) {
							b_book_count++;
							total += b_book_time;
							ans++;
						}
						else {
							break;
						}
					}
					
				}
				else {	

					if (a_book_time < b_book_time) {
						if (total + a_book_time <= K) {
							a_book_count++;
							total += a_book_time;
							ans++;
						}
						else {
							break;
						}
					}
					else {
						if (total + b_book_time <= K) {
							b_book_count++;
							total += b_book_time;
							ans++;
						}
						else {
							break;
						}
					}
				}
			}
			else if (a_book_time != -1) {
				if (total + a_book_time <= K) {
					a_book_count++;
					total += a_book_time;
					ans++;
				}
				else {
					break;
				}
			}
			else if (b_book_time != -1) {
				if (total + b_book_time <= K) {
					b_book_count++;
					total += b_book_time;
					ans++;
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}

		System.out.println(ans);
	}

	private static class FastScanner {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;

		public FastScanner(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
			tokenizer = null;
		}

		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}
