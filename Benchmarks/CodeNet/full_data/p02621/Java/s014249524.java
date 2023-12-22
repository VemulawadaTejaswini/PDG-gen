import java.io.*;
import java.util.*;

public class Main {
	
	static long mod= (long) 1e9+7;
	
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader.init(System.in);
		PrintWriter out=new PrintWriter(System.out);
		long a=Reader.nextInt();
		out.println(a+a*a+a*a*a);
		
		
		out.flush();
		
	}

}

class Seg{
	
	int[] tree,arr;
	
	Seg(int n,int[] a){
		tree=new int[4*n];arr=a;
	}
	
	void build(int index, int left, int right) {
		if(left==right) tree[index]=arr[left];
		else {
			int mid=(left+right)/2;
			build(2*index+1,left,mid);
			build(2*index+2,mid+1,right);
			tree[index]=Math.max(tree[2*index+1],tree[2*index+2]);
		}
	}
	
	int query(int index, int ql, int qr, int left, int right) {
		if(ql<=left && right<=qr) return tree[index];
		else if(ql > right || qr<left) return 0;
		else {
			int mid=(left+right)/2;
			return Math.max(query(2*index+1,left,mid,ql,qr), query(2*index+2,mid+1,right,ql,qr));
		}
	}
	
	void update(int index, int left, int right, int pos, int val) {
		if(left==right) {
			tree[index]=val;
		}
		else {
			int mid=(left+right)/2;
			if(pos<=mid) {
				update(2*index+1,left,mid,pos,val);
			}
			else update(2*index+2,mid+1,right,pos,val);
			tree[index]=Math.max(tree[2*index+1],tree[2*index+2]);
		}
	}
}


class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    /** call this method to initialize reader for InputStream */
    static void init() throws IOException {
        reader = new BufferedReader(
                new FileReader("C:\\Users\\samee\\Desktop\\GRE prep\\confusion.txt"));
        tokenizer = new StringTokenizer("");
    }
    static void init(InputStream input) {
        reader = new BufferedReader(
                new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    /** get next word */
    static String nextLine() throws IOException{
        return reader.readLine();
    }
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                    reader.readLine() );
        }
        return tokenizer.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}