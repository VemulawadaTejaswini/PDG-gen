//TLE in any case
//import java.util.Scanner;
import java.io.*;

class Main{
    public int inp[] =new int[1000*1000];
    int MAX_VALUE=2147483647;
    int min(int a,int b){return a<b?a:b;}
    int max(int a,int b){return a>b?a:b;}
    int searchmin(int r1,int c1,int r2,int c2,int c){
	int ret=MAX_VALUE;
	for(int i=r1;i<=r2;i++)
	    for(int j=c1;j<=c2;j++)ret=min(ret,inp[i*c+j]);
	return ret;
    }    

    void run(){
	Scanner in = new Scanner();
	int r,c,q;
	while(true){
	    r=in.nextInt();
	    c=in.nextInt();
	    q=in.nextInt();
	    if (r == 0)break;
	    for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
		    inp[i*c+j]=in.nextInt();
		}
	    }

	    for(int i=0;i<q;i++){
		int r1,r2,c1,c2;
		r1=in.nextInt();
		c1=in.nextInt();
		r2=in.nextInt();
		c2=in.nextInt();
		System.out.println(searchmin(r1,c1,r2,c2,c));
	    }
	}
    }
    public static void main(String args[]){
	Main a = new Main();
	a.run();
    }
}


class Scanner {
    int nextInt() {
        try {
            int c = System.in.read();
            if (c == -1)
                return c;
            while (c != '-' && (c < '0' || '9' < c)) {
                c = System.in.read();
                if (c == -1)
                    return c;
            }
            if (c == '-')
                return -nextInt();
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = System.in.read();
            } while ('0' <= c && c <= '9');
            return res;
        } catch (Exception e) {
            return -1;
        }
    }
 
    long nextLong() {
        try {
            int c = System.in.read();
            if(c==-1)return -1;
            while (c != '-' && (c < '0' || '9' < c)){
                c = System.in.read();
                if(c==-1)return -1;
            }
            if (c == '-')
                return -nextLong();
            long res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = System.in.read();
            } while ('0' <= c && c <= '9');
            return res;
        } catch (Exception e) {
            return -1;
        }
    }
 
    double nextDouble() {
        return Double.parseDouble(next());
    }
 
    String next() {
        try {
            StringBuilder res = new StringBuilder("");
            int c = System.in.read();
            while (Character.isWhitespace(c))
                c = System.in.read();
            do {
                res.append((char) c);
            } while (!Character.isWhitespace(c = System.in.read()));
            return res.toString();
        } catch (Exception e) {
            return null;
        }
    }
 
    String nextLine() {
        try {
            StringBuilder res = new StringBuilder("");
            int c = System.in.read();
            while (c == '\r' || c == '\n')
                c = System.in.read();
            do {
                res.append((char) c);
                c = System.in.read();
            } while (c != '\r' && c != '\n');
            return res.toString();
        } catch (Exception e) {
            return null;
        }
    }
}