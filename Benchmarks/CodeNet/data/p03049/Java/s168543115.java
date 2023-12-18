import java.io.IOException;
import java.io.InputStream;

public class Main {

	static FastReaderR in = new FastReaderR(System.in) ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = in.nextInt() ;
		int a = 0 ;
		int b = 0 ;
		int ab = 0 ;
		int ans = 0 ;
		for(int i=0;i<N;i++){
			String line = in.next() ;
			if(line.charAt(0)!='B'&&line.charAt(line.length()-1)!='A'){
				int index = 0 ;
				while(true){
//					System.out.println("1");
					index = line.indexOf("AB",index) ;
					if(index!=-1)
						ans++ ;
					else
						break ;
					if(index+2>=line.length())
						break ;
					index += 2 ;
				}
			}else{
				if(line.charAt(0)=='B'&&line.charAt(line.length()-1)=='A'){
					ab++ ;
					int index = 0 ;
					while(true){
						index = line.indexOf("AB",index) ;
						if(index!=-1)
							ans++ ;
						else
							break ;
						if(index+2>=line.length())
							break ;
						index += 2 ;
					}
				}else{
					if(line.charAt(line.length()-1)=='A'){
						a++ ;
						int index = 0 ;
						while(true){
							index = line.indexOf("AB",index) ;
							if(index!=-1)
								ans++ ;
							else
								break ;
							if(index+2>=line.length())
								break ;
							index += 2 ;
						}
					}
						if(line.charAt(0)=='B'){
							b++ ;
							int index = 0 ;
							while(true){
								index = line.indexOf("AB",index) ;
								if(index!=-1)
									ans++ ;
								else
									break ;
								if(index+2>=line.length())
									break ;
								index += 2 ;
							}
						}
					
				}
			}
		}
		
//		System.out.println(a+" "+b+" "+ab+ " "+ans) ;
		
		if(b>a){
			if((b-a)<=ab){
				ans += b ;
				
				ab -= (b-a) ;
				ab++ ;
				if(ab>=1){
					ans += (ab-1) ;
				}
			}else{
				ans += (a+ab) ;
				
				ab++ ;
				ab -= (b-a) ;
				if(ab>=1){
					ans += (ab-1) ;
				}
			}
		}else{
			if((a-b)<=ab){
				ans += a ;
				
				ab -= (a-b) ;
				ab++ ;
				if(ab>=1){
					ans += (ab-1) ;
				}
			}else{
				ans += (b+ab) ;
				
				ab -= (a-b) ;
				ab++;
				if(ab>=1){
					ans += (ab-1) ;
				}
			}
		}
		System.out.println(ans);
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