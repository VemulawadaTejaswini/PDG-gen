import java.io.IOException;
import java.io.InputStream;

public class Main {

	static FastReaderR in = new FastReaderR(System.in) ;
	
	static int[][] tu = null ;
	
	static int[] col = null ;
	
	static int[] cost_min = null ;
	
	static int[] short_len = null ;
	
	static boolean[] vis = null ;
	
	static int N ;
	
	static int INF = Integer.MAX_VALUE/10 ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			N = in.nextInt() ;
			col = new int[N] ;
			tu = new int[N][N] ;
			cost_min = new int[N] ;
			short_len = new int[N] ;
			vis = new boolean[N] ;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					tu[i][j] = tu[j][i] = INF ;
				}
			}
			for(int i=0;i<N-1;i++){
				int s = in.nextInt()-1 ;
				int e = in.nextInt()-1 ;
				int w = in.nextInt() ;
				tu[s][e] = tu[e][s] = w ;
			}
			for(int i=0;i<N;i++){
				if(i==0){
					short_len[i] = 0 ;
				}else{
					short_len[i] = tu[0][i] ;
				}	
			}
			dijkstra() ;
//			for(int i=0;i<N;i++){
//				System.out.print(short_len[i]+" ");
//			}
			for(int i=0;i<N;i++){
				if(short_len[i]%2==0){
					col[i] = 0 ;
				}else{
					col[i] = 1 ;
				}
			}
			for(int i=0;i<N;i++){
				System.out.println(col[i]);
			}
		}catch(Exception e){
			
		}
	}
	
	static void dijkstra(){
		
		for(int i=0;i<N;i++){
			
			int mmin =INF ;
			int index = -1 ;
			for(int j=0;j<N;j++){
				if(!vis[j] && short_len[j]<mmin){
					index = j ;
					mmin = short_len[j] ;
				}
			}
			
			vis[index] = true ;
			
			for(int k=0;k<N;k++){
				if(!vis[k]){
					if(mmin+tu[index][k]<short_len[k]){
						short_len[k] = mmin+tu[index][k] ;
					}
				}
			}
			
		}
	}

}

class FastReaderR {
    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;
 
    FastReaderR(InputStream is) {
        in = is;
    }
    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }
    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
}



