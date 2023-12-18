//--- pD ---//
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception {
		new Solution();
	}
}
class Solution {
	Reader reader;
	PrintWriter out;
	public Solution() {
		reader = new Reader();
		out = new PrintWriter(System.out);
		while (reader.hasNext()) {
			run_case();
		}
		out.flush();
	}

	private void run_case() {
		String str = reader.ns();
        int len = str.length();
		int k = 2019;
        out.println(countSubStr(str, len, k));
		return;
	}

	private long countSubStr(String str, int len, int k) {
		long cnt = 0;
		for (int i=0; i<len; i++) {
			int n = 0;
			for (int j = i; j < len; j++) {
                n = n * 10 + (str.charAt(j) - '0');
                if (n % k == 0) cnt++;
            }
		}
		return cnt;
	}
}

class GFG
{

    // Function to return the count of sub-strings
    // of str that are divisible by k
    static int countSubStr(String str, int len, int k)
    {
        int count = 0;

        for (int i = 0; i < len; i++)
        {
            int n = 0;

            // Take all sub-strings starting from i
            for (int j = i; j < len; j++)
            {
                n = n * 10 + (str.charAt(j) - '0');

                // If current sub-string is divisible by k
                if (n % k == 0)
                    count++;
            }
        }

        // Return the required count
        return count;
    }

    // Driver code
    public static void main(String []args)
    {
        String str = "33445";
        int len = str.length();
        int k = 11;
        System.out.println(countSubStr(str, len, k));
    }
}

// 2019
// 4038
// 6057
// 80

class Reader {
	BufferedReader br;
	StringTokenizer st;
	public Reader(){
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String next() {
		if (st.hasMoreTokens()) return st.nextToken();
		try {
			st = new StringTokenizer(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st.nextToken();
	}
	public boolean hasNext() {
		try {
			if (!st.hasMoreTokens() && !br.ready()) return false;
			else return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public int ni() {return Integer.parseInt(this.next());}
	public long nl() {return Long.parseLong(this.next());}
	public String ns() {return this.next();}
}
