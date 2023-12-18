package Grand_Contest_033;

import java.io.*;

public class Main {

	static int all = 0 ; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FastReaderR in = new FastReaderR(System.in) ;
		int row , col ;
		row = in.nextInt() ; 
		col = in.nextInt() ;
		
		all = row * col ;
		
		int sq[][] = new int[row][col] ; 
		
		for(int i=0;i<row;i++){
			String line = in.next() ;
			for(int j=0;j<col;j++){
				if(line.charAt(j)=='#'){
					//black
					sq[i][j] = 1 ; 
					//white-- ;
				}
				//else sq[i][j] = 0 ;
			}
		}
		
		int cnt = 0 ;
		
		while(true){
			
			int temp = 0 ;
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					if(sq[i][j]==1)
						temp++ ;
				}
			}
			if(temp==all)
				break ;
			
			sq = f(sq) ;
//			for(int i=0;i<row;i++){
//				for(int j=0;j<col;j++){
//					if(sq[i][j]==1)
//						System.out.print("#");
//					else
//						System.out.print(".");
//					//else sq[i][j] = 0 ;
//				}
//				System.out.println("");
//			}
//			System.out.println("");
			
			cnt++ ;
			
			
			
//			System.out.println(cnt) ;
		}
		
		System.out.println(cnt) ;
	}
	
	public static int[][] f(int[][] before){
		int[][] copy = null ;
		copy = new int[before.length][before[0].length] ;
		for(int i=0;i<before.length;i++){
			for(int j=0;j<before[0].length;j++){
				if(before[i][j]==1){
					copy[i][j] = 1 ;
					if(i+1<before.length){
						if(before[i+1][j]==0){
							//white-- ;
							//before[i+1][j] = 1 ;
							copy[i+1][j] = 1 ;
						}
					}
					if(j+1<before[0].length){
						if(before[i][j+1]==0){
							//white-- ;
							//before[i][j+1] = 1 ;
							copy[i][j+1] = 1 ;
						}
					}
					if(i-1>=0){
						if(before[i-1][j]==0){
							//white-- ;
							//before[i-1][j] = 1 ;
							copy[i-1][j] = 1 ;
						}
					}
					if(j-1>=0){
						if(before[i][j-1]==0){
							//white-- ;
							//before[i][j-1] = 1 ;
							copy[i][j-1] = 1 ;
						}
					}
				}
			}
		}
		
		return copy ;
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
