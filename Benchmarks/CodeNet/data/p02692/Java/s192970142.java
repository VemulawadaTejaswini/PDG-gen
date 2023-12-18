import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int[] s_ = new int[N];
        for (int i=0;i<N;i++) {
        	String s = in.next();
        	if (s.equals("AB")) s_[i] = 0;
        	else if (s.equals("BC")) s_[i] = 1;
        	else if (s.equals("AC")) s_[i] = 2;
        }

        out.println("Yes");
        for (int i=0;i<N;i++) {
        	if (s_[i] == 0) {
        		if (A>1) {
        			A--;
        			B++;
        			out.println("B");
        		} else if (B>1) {
        			A++;
        			B--;
        			out.println("A");
        		} else if (A==1 && B==0) {
        			A--;
        			B++;
        			out.println("B");
        		} else if (A==0 && B==1) {
        			A++;
        			B--;
        			out.println("A");
        		} else if (A==1 && B==1) {
        			if (i==N-1) {
        				A--;
        				B++;
        				out.println("B");
        			} else if (s_[i+1] == 0) {
        				A--;
        				B++;
        				out.println("B");
        			} else if (s_[i+1] == 1) {
        				A--;
        				B++;
        				out.println("B");
        			} else if (s_[i+1] == 2) {
        				A++;
        				B--;
        				out.println("A");
        			}
        		} if (A<=0 && B<=0) {
        			System.out.println("No");
        			return;
        		}
        	} else if (s_[i] == 1) {
        		if (B>1) {
        			B--;
        			C++;
        			out.println("C");
        		} else if (C>1) {
        			B++;
        			C--;
        			out.println("B");
        		} else if (B==1 && C==0) {
        			B--;
        			C++;
        			out.println("C");
        		} else if (B==0 && C==1) {
        			B++;
        			C--;
        			out.println("B");
        		} else if (B==1 && C==1) {
        			if (i==N-1) {
        				B--;
        				C++;
        				out.println("C");
        			} else if (s_[i+1] == 0) {
        				B++;
        				C--;
        				out.println("B");
        			} else if (s_[i+1] == 1) {
        				B--;
        				C++;
        				out.println("C");
        			} else if (s_[i+1] == 2) {
        				B--;
        				C++;
        				out.println("C");
        			}
        		} if (B<=0 && C<=0) {
        			System.out.println("No");
        			return;
        		}

        	} else if (s_[i] == 2) {
        		if (A>1) {
        			A--;
        			C++;
        			out.println("C");
        		} else if (C>1) {
        			A++;
        			C--;
        			out.println("A");
        		} else if (A==1 && C==0) {
        			A--;
        			C++;
        			out.println("C");
        		} else if (A==0 && C==1) {
        			A++;
        			C--;
        			out.println("A");
        		} else if (A==1 && C==1) {
        			if (i==N-1) {
        				A--;
        				C++;
        				out.println("C");
        			} else if (s_[i+1] == 0) {
        				A++;
        				C--;
        				out.println("A");
        			} else if (s_[i+1] == 1) {
        				A--;
        				C++;
        				out.println("C");
        			} else if (s_[i+1] == 2) {
        				A++;
        				C--;
        				out.println("A");
        			}
        		} if (A<=0 && C<=0) {
        			System.out.println("No");
        			return;
        		}
        	}
        }

		out.close();
	}

	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
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

    }
}
