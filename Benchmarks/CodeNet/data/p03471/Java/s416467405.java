import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N, Y;
        {int[] a = r.ii(); N = a[0]; Y = a[1];}
        for(int ten = 0; ten <= N; ten++){
            for(int five = 0; five <= N-ten; five++){
                int one = N-ten-five;
                if(ten*10+five*5+one == Y/1000){
                    System.out.printf("%d %d %d\n", ten, five, one);
                    return;
                }
            }
        }
        System.out.printf("%d %d %d\n", -1, -1, -1);
    }
    static int Int(String s){
        return Integer.parseInt(s);
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
    }
}