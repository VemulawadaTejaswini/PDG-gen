import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N, Y;
        {int[] a = r.ii(); N = a[0]; Y = a[1];}
        int ten = Y/10000;
        int five = (Y-10000*ten)/5000;
        int one = Y-10000*ten-5000*five;
        boolean flag = true;
        int extra = N-ten-five-one;
        if(extra < 0)
            flag = false;
        while(flag && (extra = N-ten-five-one) > 0){            
            if(extra >= 9){
                if(ten > 0){
                    ten--;
                    one += 10;
                } else
                    flag = false;
            } else if(extra >= 4){
                if(five > 0){
                    five--;
                    one += 5;
                } else if(extra > 4 && ten > 0){
                    ten--;
                    five++;
                    one += 5;
                }else
                    flag = false; 
            } else{
                if(ten > 0){
                    ten--;
                    five += 2;
                } else
                    flag = false;
            }            
        }
        if(!flag)
            ten = (five = (one = -1));
        println(ten + " " + five + " " + one);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static int Int(String s){
        return Integer.parseInt(s);
    }
    static long Long(String s){
        return Long.parseLong(s);
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
        long l() throws IOException{
            return Long(s());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}