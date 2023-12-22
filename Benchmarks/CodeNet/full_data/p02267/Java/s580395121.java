import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    //線形探索
    static boolean linearSearch(int[] s, int n, int key){
        int i = 0;
        s[n] = key;//番兵
        while(s[i] != key){
            i++;
        }
        if(i == n){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int n = Integer.parseInt(br.readLine());
            String[] str1 = br.readLine().split(" ");
            int[] s = new int[n + 1];//+1は番兵の分
            for(int i = 0; i < n; i++)
                s[i] = Integer.parseInt(str1[i]);

            int q = Integer.parseInt(br.readLine());
            String[] str2 = br.readLine().split(" ");
            int[] t = new int[q];
            for(int i = 0; i < q; i++)
                t[i] = Integer.parseInt(str2[i]);

            int count = 0;
            for(int i = 0; i < q; i++)
                if(linearSearch(s, n, t[i]))
                    count++;
                

            System.out.println(count);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
