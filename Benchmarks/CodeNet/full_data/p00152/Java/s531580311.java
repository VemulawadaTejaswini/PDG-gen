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
    	while(true) {
    		int m = Integer.parseInt(stdIn.nextLine());
    		if(m == 0) break;
    		Data[] ax = new Data[m];
    		for(int i = 0; i < m; i++) {
    			String[] in = stdIn.nextLine().split(" ");
    			String id = in[0];
    			int[] ar = new int[in.length-1];
    			
    			for(int j = 0; j < ar.length; j++) {
    				ar[j] = Integer.parseInt(in[j+1]);
    			}
    			int[] score = new int[10];
    			boolean[] st = new boolean[10];
    			int frame = 0;
    			int sum = 0;
    			boolean f = true;
    			for(int j = 0; j < ar.length; j++) {
    				if(frame == 9) {
    					if(j + 3 == ar.length) {
    						sum += ar[j] + ar[j+1] + ar[j+2];
    						break;
    					}
    					else {
    						sum += ar[j] + ar[j+1];
    						break;
    					}
    				}
    				else {
    					if(f) {
	    					sum += ar[j];
	    					if(ar[j] == 10) {
	    						sum += ar[j+1] + ar[j+2];
	    						frame++;
	    						continue;
	    					}
	    					f = false;
    					}
    					else {
    						sum += ar[j];
    						if(ar[j] + ar[j-1] == 10) {
    							sum += ar[j+1];
    							
    						}
    						frame++;
    						f = true;
    						
    					}
    				
    				}
    			}
    			
    			ax[i] = new Data(Integer.parseInt(id),sum);
    		}
    		Arrays.sort(ax,new MyComp());
    		
    		for(int i = 0; i < ax.length; i++) {
    			out.println(ax[i].id + " " + ax[i].score);
    		}
    	}
    	out.flush();
    }
         
 
}

class Data {
	int id;
	int score;
	Data(int a, int b) {
		id = a;
		score = b;
	}
}

class MyComp implements Comparator<Data>{

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.score < o2.score) {
			return 1;
		}
		else if(o1.score > o2.score) {
			return -1;
		}
		else if(o1.id < o2.id) {
			return -1;
		}
		return 1;
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