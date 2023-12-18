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
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final String s = sc.next();
		final String t = sc.next();

		final int index[][] = new int[s.length()+1][26];
		Arrays.fill(index[s.length()], -1);

		for(int i=s.length()-1;i>=0;i--) {
			for(int l=0;l<26;l++) {
				index[i][l]=index[i+1][l];
			}
			int l = s.charAt(i) - 'a';
			index[i][l]=i;
		}

		/*
		for(int i=0;i<index.length;i++) {
			out.print(index[i][0]);
			for(int l=1;l<26;l++) {
				out.print("\t"+index[i][l]);
			}
			out.println();
		}
		*/

		long offset = 0;
		int cursor = 0;

		for(int i=0;i<t.length();i++) {
			final int letter = t.charAt(i)-'a';
			final int next = index[cursor][letter];
			if(next == -1) {
				if(cursor == 0) {
					out.println("-1");
					return;
				}else {
					offset += s.length();
					cursor = 0;
					i--; // unread
					continue;
				}
			}else {
				cursor = next+1;
			}
		}
		out.println(offset + cursor);

		/*
		final int[] pos = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			final int letter = s.charAt(i)-'a';
			pos[i] = (letter<<24 | i);
		}
		Arrays.sort(pos);
		final int[] index = new int[26];
		int head = 'a' << 24;
		int curIndex = 1;
		for(int i=0;i<pos.length;i++) {
			if((pos[i]&head)!=head) {
				head = pos[i]&0xFF000000;
				index[curIndex]=i;
				curIndex++;
			}
		}



		final int[] scnt = new int[26];
		final int[] tcnt = new int[26];

		for(int i=0;i<s.length();i++) {
			final int letter = s.charAt(i)-'a';
			scnt[letter]++;
		}
		for(int i=0;i<t.length();i++) {
			final int letter = t.charAt(i)-'a';
			tcnt[letter]++;
		}

		int loop = 0;

		for(int i=0;i<26;i++) {
			if(scnt[i]==0 && tcnt[i]!=0) {
				out.println(-1);
				return;
			}
			if(scnt[i] < tcnt[i]) {
				loop = Math.max(loop, tcnt[i]/scnt[i]);
			}
		}




		final int head[] = new int[26];
		Arrays.fill(head, Integer.MAX_VALUE);

		final boolean contains[] = new boolean[26];

		for(int i=0;i<s.length();i++) {
			final int letter = s.charAt(i)-'a';
			head[letter] = Math.min(head[letter], i);
		}
		for(int i=0;i<t.length();i++) {
			final int letter = t.charAt(i)-'a';
			contains[letter] = true;
		}

		for(int i=0;i<26;i++) {
			if(contains[i] && (head[i]==Integer.MAX_VALUE)) {
				out.println("-1");
				return;
			}
		}
		final int headLetter = t.charAt(0)-'a';
		out.println(head[headLetter]);
	*/
	}
}
