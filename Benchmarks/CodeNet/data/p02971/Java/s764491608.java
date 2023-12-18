import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.next());
        List<Integer> is = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            is.add(Integer.parseInt(s.next()));
        }
        for(int i=0;i<is.size();i++){
            int max = 0;
            for(int j=0;j<is.size();j++) {
                if(j==i){
                    continue;
                }
                int h = is.get(j);
                if(max < h){
                    max = h;
                }
            }
            System.out.println(max);
        }
    }
}

class Scanner {
    private final InputStream is;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public Scanner(InputStream is){
        this.is = is;
    }
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = is.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        }else{
            return -1;
        }
    }
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
        while(hasNextByte() && !isPrintableChar(buffer[ptr])){
            ptr++;
        }
        return hasNextByte();
    }
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
}