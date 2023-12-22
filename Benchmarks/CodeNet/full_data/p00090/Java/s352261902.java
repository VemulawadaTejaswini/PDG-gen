
import java.awt.geom.Point2D;
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D.Double[] list = new Point2D.Double[n];
			for (int i = 0; i < n; i++) {
				String tmp[] = sc.next().split(",");
				list[i] = new Point2D.Double(Double.parseDouble(tmp[0]), Double.parseDouble(tmp[1]));
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					Point2D.Double[] tmp = CircleCross.getCross(list[i],list[j]);
					if(tmp != null)
					for (int k = 0; k < tmp.length; k++) {
						int count = 0;
						for (int l = 0; l < n; l++) {
							if (Point2D.Double.distance(tmp[k].getX(),
									tmp[k].getY(), list[l].getX(),
									list[l].getY()) <= 1.0) {
								count++;
							}
						}
						if (count > max) {
							max = count;
						}
					}
				}
			}
			out.println(max);
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
    	return (int)nextLong();
    }
    
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
    

}

class CircleCross {
static double DIF = 10e-6;	
	public static Point2D.Double[] getCross(Point2D.Double p1, Point2D.Double p2) {
        Point2D.Double[]  cRet = null;
 
        if (p1 != null && p2 != null) {
            double  length = p1.distance(p2);
            if (length <= DIF) {
                cRet    = new Point2D.Double[1];
                cRet[0] = new Point2D.Double(p1.x, p1.y);
            } else if (length <= 2.0 + DIF) {
                double  theta = Math.atan2(p2.y - p1.y, p2.x - p1.x);
                double  alpha = Math.acos(length / 2.0);
 
                cRet    = new Point2D.Double[2];
                cRet[0] = new Point2D.Double(p1.x + Math.cos(theta + alpha), p1.y + Math.sin(theta + alpha));
                cRet[1] = new Point2D.Double(p1.x + Math.cos(theta - alpha), p1.y + Math.sin(theta - alpha));
            }
        }
 
        return cRet;
    }
}