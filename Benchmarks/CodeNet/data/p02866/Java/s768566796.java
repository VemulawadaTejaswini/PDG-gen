import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        int count = 0;
        int[] input = null;
        int[] box = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = bufferedReader.readLine();
            String str2 = bufferedReader.readLine();
            String[] st = str2.split(" ");
            count = Integer.parseInt(str);
            input = new int[count];
            box = new int[count+1];
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
        if(box[0] != 1 || input[0] != 0){
            System.out.println(0);
        } else{
            long ans = 1;
            for(int i = 1;i < count;i++){
                ans = ans * (long)Math.pow(box[i],box[i+1]) % 998244353;
                if(ans == 0){
                    break;
                }
            }
            System.out.println("" + ans);
        }

    }
}