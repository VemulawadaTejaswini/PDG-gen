import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();    
        int N = r.i();
        ArrayList<Resto> array = new ArrayList<>();
        for(int i = 0; i < N; i++){
            String[] temp = r.ss();
            String city = temp[0];
            int p = Int(temp[1]);
            array.add(new Resto(i+1, city, p));
        }
        array.sort((x, y) -> {
            int a = x.city.compareTo(y.city);
            if(a != 0)
                return a;
            return -x.p+y.p;
        });
        for(Resto res : array)
            println(res.id);
    }
    static class Resto{
        int id;
        String city;
        int p;
        Resto(int i, String c, int pt){
            id = i;
            city = c;
            p = pt;
        }
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
