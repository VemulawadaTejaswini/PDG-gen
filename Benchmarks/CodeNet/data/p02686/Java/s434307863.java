import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }

    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c){
        return 33<=c && c<=126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
        return hasNextByte();
    }

    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b<='9'){
                n*=10;
                n+=b-'0';
            }else if(b==-1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = Integer.parseInt(sc.next());
        char[][] s = new char[n][];
        int[][] count = new int[n][4];
        int sum = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            s[i] = sc.next().toCharArray();
            for(int j=0;j<s[i].length;j++){
                if(s[i][j]=='('){
                    count[i][0]++;
                    sum++;
                }else{
                    if(count[i][0] > 0){
                        count[i][0]--;
                    }else{
                        count[i][1]++;
                    }
                    sum2++;
                }
            }
            count[i][2] = count[i][0]-count[i][1];
            if(count[i][0] > 0 && count[i][1] > 0){
                count[i][3] = 2;
            }else if(count[i][0] > 0){
                count[i][3] = 1;
            }else if(count[i][1] > 0){
                count[i][3] = 3;
            }else{
                count[i][3] = 4;
            }

        }
        if(sum!=sum2){
            System.out.println("No");
            return;
        }
        final int a = sum;
        Arrays.sort(count,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
                if(o1[3] == o2[3] && o1[3] == 2){
                    int a1 = o1[1]-a;
                    int a2 = o2[1]-a;
                    if(a1<=0 && a2<=0 || a1>=0 && a2>=0){
                        return o2[2]-o1[2];
                    }else{
                        return o1[1]-o2[1];
                    }
                }else{
                    return o1[3] - o2[3];
                }
				
			}
        });
        sum = 0;
        for(int i=0;i<n;i++){
            if(count[i][3]==2){
                sum-=count[i][1];
                if(sum < 0){
                    System.out.println("No");
                    return;
                }
                sum+=count[i][0];
            }else{
                sum+=count[i][0];
                sum-=count[i][1];
                if(sum<0){
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");


    }
    
}