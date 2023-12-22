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
 
public class Main {
 
    static final PrintWriter out = new PrintWriter(System.out);
    static final FastScanner sc = new FastScanner();
    static final Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {
    	int n = sc.nextInt();
    	int l = sc.nextInt();
    	int[] list = new int[n];
    	for(int i = 0; i < n; i++) {
    		list[i] = sc.nextInt();
    	}
    	int count = 0;
    	int time  = 0;
    	PriorityQueue<Data> ar1 = new PriorityQueue<Data>();
    	PriorityQueue<Data> ar2 = new PriorityQueue<Data>();
    	if(list[0] > list[1]) ar1.add(new Data(0,list[0]));
    	if(list[n-1] > list[n-2]) ar1.add(new Data(n-1,list[n-1]));
    	if(n > 2)
    	for(int i = 1; i < n-1; i++) {
    		if(list[i] > list[i-1] && list[i] > list[i+1]) ar1.add(new Data(i,list[i]));
    	}
    	boolean c = true;
    	while(count != n) {
    		if(c) {
    			int max = ar1.peek().len;
    			time += l - max;
    			while(!ar1.isEmpty()) {
    				Data tmp = ar1.poll();
    				if(tmp.len == max) {
    					list[tmp.id] = 0;
    					count++;
    					if(tmp.id != 0) {
	    					if(tmp.id - 2 >= 0) {
	    						if(list[tmp.id-1] >= list[tmp.id-2] && list[tmp.id-1] != 0) ar2.add(new Data(tmp.id-1,list[tmp.id-1]));
	    					}
	    					else {
	    						if(list[tmp.id-1] != 0) ar2.add(new Data(tmp.id-1,list[tmp.id-1]));
	    					}
    					}
    					if(tmp.id != n-1) {
    						if(tmp.id + 2 <= n-1) {
    							if(list[tmp.id+1] >= list[tmp.id+2] && list[tmp.id+1] != 0) ar2.add(new Data(tmp.id+1,list[tmp.id+1]));
	    					}
	    					else {
	    						if(list[tmp.id+1] != 0) ar2.add(new Data(tmp.id+1,list[tmp.id+1]));
	    					}
    					}
    				}
    				else {
    					//list[tmp.id] += l - max;
    					tmp.len += l - max;
    					ar2.add(tmp);
    				}
    			}
    			c = false;
    		}
    		else {
    			int max = ar2.peek().len;
    			time += l - max;
    			while(!ar2.isEmpty()) {
    				Data tmp = ar2.poll();
    				if(tmp.len == max) {
    					list[tmp.id] = 0;
    					count++;
    					if(tmp.id != 0) {
	    					if(tmp.id - 2 >= 0) {
	    						if(list[tmp.id-1] >= list[tmp.id-2] && list[tmp.id-1] != 0) ar1.add(new Data(tmp.id-1,list[tmp.id-1]));
	    					}
	    					else {
	    						if(list[tmp.id-1] != 0) ar1.add(new Data(tmp.id-1,list[tmp.id-1]));
	    					}
    					}
    					if(tmp.id != n-1) {
    						if(tmp.id + 2 <= n-1) {
    							if(list[tmp.id+1] >= list[tmp.id+2] && list[tmp.id+1] != 0) ar1.add(new Data(tmp.id+1,list[tmp.id+1]));
	    					}
	    					else {
	    						if(list[tmp.id+1] != 0) ar1.add(new Data(tmp.id+1,list[tmp.id+1]));
	    					}
    					}
    				}
    				else {
    					//list[tmp.id] += l - max;
    					tmp.len += l - max;
    					ar1.add(tmp);
    				}
    			}
    			c = true;
    		}
    	}
    	System.out.println(time);
    	
    	
    	
    	
    	
    	
    }
    static class Data implements Comparable<Data> {
    	int id;
    	int len;
    	Data(int a, int b) {
    		id = a;
    		len = b;
    	}
    	
		@Override
		public int compareTo(Data o) {
			return o.len - this.len;
		}
    	
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