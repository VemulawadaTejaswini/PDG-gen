import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int q = fs.nextInt();
        List<int[]> events = new ArrayList<>();
        int s,t,x;
        for(int i=0;i<n;i++){
            s = fs.nextInt();
            t = fs.nextInt();
            x = fs.nextInt();
            events.add(new int[]{s-x,1,x});
            events.add(new int[]{t-x,-1,x});
        }
        int[] d = new int[q];
        for(int i=0;i<q;i++){
            d[i] = fs.nextInt();
        }
        //Ti-1-Dk<Xi またはSi-1-Dk>=Xiなら止まらない
        //Si-Xi<= Dk < Ti-Xiなら通行止め
        //をみたす最小のiがあればそのXiで止まる

        Collections.sort(events,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]-o2[0];
			}
        });
        PrintWriter out = new PrintWriter(System.out);
        int idx = 0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Integer tmp;
        for(int i=0;i<q;i++){
           for(;idx < events.size() && events.get(idx)[0] <= d[i];idx++){
               if(events.get(idx)[1]==1){
                   tmp = map.get(events.get(idx)[2]);
                   if(tmp == null){
                       map.put(events.get(idx)[2],1);
                    }else{
                        map.put(events.get(idx)[2],tmp+1);
                    }
               }else{
                   tmp = map.get(events.get(idx)[2]);
                   if(tmp == 1){
                        map.remove(events.get(idx)[2]);
                   }else{
                        map.put(events.get(idx)[2],tmp-1);
                   }
                   
               }
            }
            if(map.isEmpty()){
                out.println(-1);
            }else{
                out.println(map.firstKey());
            }
        }
        out.flush();



    }
    static class FastScanner{
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
                if(buflen <= 0){
                    return false;
                }
            }
            return true;
        }

        private int readByte(){
            if(hasNextByte())return buffer[ptr++];
            else return -1;
        }

        private boolean isPrintableChar(int c){
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
            return (int)nl;
        }
        public double nextDouble(){return Double.parseDouble(next());}
    }
}