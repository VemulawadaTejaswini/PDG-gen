
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.awt.geom.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main{

    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        String[] str = new String[h];
        int time = 0;
        Point[] point = new Point[n+1];
        Point start = new Point();
        boolean[][] judge = new boolean[h][w];
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        for(int i=0;i<h;i++){
        	str[i] = sc.next();
        	for(int j=0;j<w;j++){
        		if((int)'0'<str[i].charAt(j) && str[i].charAt(j)<=(int)'9'){
        			point[(int)str[i].charAt(j)-(int)'0'] = new Point(i,j);
        		}
        		if(str[i].charAt(j)=='S'){
        			start.x = i;
        			start.y = j;
        		}
        	}
        }

        ArrayList<Point> list = new ArrayList<Point>();
        ArrayList<Point> list2 = new ArrayList<Point>();

        for(int k=1;k<=n;k++){
        	list.clear();
        	list2.clear();
        	list.add(start);
        	boolean flag = false;
        	for(int l=0;l<h;l++){
        		Arrays.fill(judge[l],true);
        	}
        	while(true){
        		time++;
	        	while(!list.isEmpty()){
   	     			Point pp = list.get(0);
   	     			judge[pp.x][pp.y] = false;
        			list.remove(0);
        			if(point[k].x == pp.x && point[k].y == pp.y){
        				start.x = pp.x;
        				start.y = pp.y;
        				flag = true;
        				break;
        			}
        			for(int i=0;i<4;i++){
        				if(pp.x == 0 && i==0){
        					continue;
        				}
        				if(pp.x == h-1 && i==2){
        					continue;
        				}
        				if(pp.y == 0 && i==1){
        					continue;
        				}
        				if(pp.y == w-1 && i==3){
        					continue;
        				}
        				if(judge[pp.x+dx[i]][pp.y+dy[i]] && str[pp.x+dx[i]].charAt(pp.y+dy[i])!='X'){
        					Point p = new Point(pp.x+dx[i],pp.y+dy[i]);
        					judge[p.x][p.y] = false;
        					list2.add(p);
        				}
        			}
        		}
        		if(flag){
        			break;
        		}
        		list.clear();
        		for(int j=0;j<list2.size();j++){
        			list.add(list2.get(j));
        		}
        		list2.clear();
        	}
        }
        out.println(time-n);
        out.flush();
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this.x = 0;
		this.y = 0;
	}
}

class Reader {
    private final InputStream sc;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.sc = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = sc

.read(buf);
        }catch (IOException e) {e.printStackTrace();}
        if (buflen <= 0) return false;
        return true;
    }

    private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

    private void skip() { while(hasNextByte() && !isPrintableChar(buf[ptr])) ptr++;}

    public boolean hasNext() {skip(); return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        boolean minus = false;
        long num = readByte();

        if(num == '-'){
            num = 0;
            minus = true;
        }else if (num < '0' || '9' < num){
            throw new NumberFormatException();
        }else{
            num -= '0';
        }
        
        while(true){
            int b = readByte();
            if('0' <= b && b <= '9')
                num = num * 10 + (b - '0');
            else if(b == -1 || !isPrintableChar(b))
                return minus ? -num : num;
            else
                throw new NoSuchElementException();
        }
    }

    public int nextInt() {
        long num = nextLong();
        if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
            throw new NumberFormatException();
        return (int)num;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public char nextChar() {
        if (!hasNext()) throw new NoSuchElementException();
        return (char)readByte();
    }

    public String nextLine() {
        while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
        if (!hasNextByte()) throw new NoSuchElementException();

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (b != '\n' && b != '\r') {
            sb.appendCodePoint(b);
            b = readByte();
        }

        return sb.toString();
    }

    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) res[i] = nextInt();
        return res;
    }

    public char[] nextCharArray(int n) {
        char[] res = new char[n];
        for (int i=0; i<n; i++) res[i] = nextChar();
        return res;
    }

    public void close() {try{ sc.close();}catch(IOException e){ e.printStackTrace();}};
}