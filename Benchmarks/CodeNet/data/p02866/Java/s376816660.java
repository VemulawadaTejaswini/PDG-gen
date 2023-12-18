import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        int count = 0;
        long[] input = null;
        long[] box = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = bufferedReader.readLine();
            String str2 = bufferedReader.readLine();
            String[] st = str2.split(" ");
            count = Integer.parseInt(str);
            input = new long[count];
            box = new long[count+1];
            int c = 0;
            for(String s: st){
                int a = Integer.parseInt(s);
                input[c] = a;
                box[a]++;
                c++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        if(box[0] != 1L || input[0] != 0L){
            System.out.println(0);
        } else{
            long ans = 1;
            for(int i = 1;i < count;i++){
                ans = (ans % 998244353L) * (pow(box[i],box[i+1]) % 998244353L) % 998244353L;
                if(ans == 0L){
                    break;
                }
            }
            System.out.println("" + ans);
        }

    }
    public static long pow(long a,long b){
        long s = 1L;
        for(long i = 0;i < b; i++){
            s = s * a % 998244353L; 
        }
        return s;
    }
}