import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

	static FastReaderR in = new FastReaderR(System.in) ;
	
	static LinkedList<pair> l = new LinkedList<>() ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = in.nextInt() ;
		int i = 1 ;
		while(N-- > 0){
			pair p = new pair() ;
			p.s = in.next() ;
			p.p = in.nextInt() ;
			p.index = i++ ;
			l.add(p) ;
		}
		Collections.sort(l,new Comparator<pair>() {

			@Override
			public int compare(pair o1, pair o2) {
				// TODO Auto-generated method stub
//				int f = -1 ;
				int f = 0 ;
				if(o1.s.compareTo(o2.s)<0)
					f = -1 ;
				else{
					if(o1.s.compareTo(o2.s)==0){
						if(o1.p>o2.p)
							f = -1 ;
						else{
							if(o1.p==o2.p)
								f = 0 ;
							else
								f = 1 ;
						}
					}else{
						f = 1 ;
					}
				}
				return f ;
			}
		});
		for(pair p:l){
			System.out.println(p.index) ;
		}
	}

}

class pair{
	String s ; int p ; int index ;
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