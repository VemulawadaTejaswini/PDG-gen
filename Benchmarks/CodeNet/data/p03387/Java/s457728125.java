import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();
        int[] num = r.ii(),
        even = new int[3];
        Arrays.sort(num);
        for(int i = 0; i < 3; i++)
            if(num[i]%2 == 0)
                even[i] = 1;

        int total = even[0] + even[1] + even[2],
        ans = 0;
        if(total%3 > 0){
            ans++;
            for(int i = 0; i < 3; i++)
                if(even[i] == total%2)
                    num[i]--;
        }
        ans += num[2] - (num[0]+num[1])/2;
        print(ans);
    }

    static void print(Object o){
        System.out.println(o.toString());
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

        int Int(String s){
            return Integer.parseInt(s);
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
