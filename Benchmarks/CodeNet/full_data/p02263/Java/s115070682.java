import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		while(sc.hasNext()) {
			String str = sc.next();
			if(str.equals("+")) {
				int b = s.pop();
				int a = s.pop();
				s.push(a+b);			
			} else if(str.equals("-")) {
				int b = s.pop();
				int a = s.pop();
				s.push(a-b);
			} else if(str.equals("*")) {
				int b = s.pop();
				int a = s.pop();
				s.push(a*b);
			} else {
				s.push(Integer.parseInt(str));
			}
		}
		
		System.out.println(s.pop());

	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        boolean hasNext(){
        	if(st != null && st.hasMoreElements()) {
        		return true;
        	} else {
        		try {
					br.mark(1024);
					if(br.readLine() == null) {
						br.reset();
						return false;
					} else {
						br.reset();
						return true;
					}
	        			
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
        	}
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}