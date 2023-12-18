import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();     
        int H, W;
        {int[] a = r.ii(); H = a[0]; W = a[1];}
        char[][] s = new char[H][W];
        for(int i = 0; i < H; i++){
            String t = r.s();
            for(int j = 0; j < W; j++)
                s[i][j] = t.charAt(j);
        }
        int[][] tate = new int[H][W];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                int temp = 0;
                int start = j;
                while(j < W && s[i][j] == '.'){
                    j++;
                    temp++;
                }
                for(int k = start; k < j; k++){
                    tate[i][k] = temp; 
                }
            }
        }
        int[][] yoko = new int[H][W];
        for(int j = 0; j < W; j++){
            for(int i = 0; i < H; i++){
                int temp = 0;
                int start = i;
                while(i < H && s[i][j] == '.'){
                    i++;
                    temp++;
                }
                for(int k = start; k < i; k++){
                    yoko[k][j] = temp; 
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                int temp = tate[i][j]+yoko[i][j]-1;
                if(ans < temp)
                    ans = temp;
            }
        }
        println(ans);        
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