
import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;



public class Main {

	static PrintWriter out = new PrintWriter(System.out);
	static FastScanner sc = new FastScanner();
	static Scanner stdIn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int g = sc.nextInt();
			if(s == 0 || s >= 6) {
				out.print(s);
				IN:while(true) {
					s++;
					if(s == 10) {
						s = 5;
						out.print(" " +s);
						if(s == g) break IN;
						while(true) {
							s--;
							if(s == -1) {
								s = 1;
								out.print(" " + s);
								while(true) {
									s++;
									out.print(" " + s);
									if(s == g) break IN;
								}
							}
							out.print(" " + s);
							if(s == g) break IN;
							
						}
					}
					out.print(" " + s);
					if(s == g) break IN;
				}
				out.println();
			}
			else {
				int count = 0;
				int tmps = s;
				IN:while(true) {
					tmps++;
					count++;
					if(tmps == 10) {
						tmps = 5;
						if(tmps == g) break;
						while(true) {
							tmps--;
							count++;
							if(tmps == g) break IN;
						}
					}
					
					if(tmps == g) break;
				}
				
				int countA = 0;
				tmps = s;
				IN: while(true) {
					tmps--;
					countA++;
					if(tmps == -1) {
						tmps = 1;
						if(tmps == g) break;
						while(true) {
							tmps++;
							countA++;
							if(tmps == g) break IN;
						}
					}
					if(tmps == g) break;
				}
				
				if(countA < count) {
					tmps = s;
					out.print(tmps);
					IN: while(true) {
						tmps--;
						countA++;
						if(tmps == -1) {
							tmps = 1;
							out.print(" " + tmps);
							if(tmps == g) break;
							
							while(true) {
								tmps++;
								countA++;
								out.print(" " + tmps);
								if(tmps == g) break IN;
								
							}
						}
						out.print(" " +tmps);
						if(tmps == g) break;
						
					}
				}
				else {
					tmps = s;
					out.print(tmps);
					IN:while(true) {
						tmps++;
						count++;
						if(tmps == 10) {
							tmps = 5;
							if(tmps == g) break;
							out.print(" " +tmps);
							while(true) {
								tmps--;
								count++;
								out.print(" " +tmps);
								if(tmps == g) break IN;
								
							}
						}
						out.print(" " +tmps);
						if(tmps == g) break;
						
					}
				}
				out.println();
			}
			
		}
		out.flush();
	}

}

//------------------------------//
//-----------//
class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    
    public int nextInt() {
    	 if (!hasNext()) throw new NoSuchElementException();
         int n = 0;
         boolean minus = false;
         int b = readByte();
         if (b == '-') {
             minus = true;
             b = readByte();
         }
         if (b < '0' || '9' < b) {
             throw new NumberFormatException();
         }
         while(true){
             if ('0' <= b && b <= '9') {
                 n *= 10;
                 n += b - '0';
             }else if(b == -1 || !isPrintableChar(b)){
                 return minus ? -n : n;
             }else{
                 throw new NumberFormatException();
             }
             b = readByte();
         }
    }
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}