import java.io.*;
import java.util.*;



public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                    
        str = br.readLine();
        int x = Integer.parseInt(str.trim());

        int ans = 0;
        for(int i = 0;i < x ;i++){
            str = br.readLine();
            int temp = Integer.parseInt(str.trim());
            int count = 0;
            for(int j = 1; j <= temp ;j++){
                int m = temp % j;
                if(m == 0){
                    count++;
                }
            }
            if(count ==2){
                ans++;
                //System.out.println(temp);
            }
        }

        System.out.println(ans);

        br.close();
    }

    
}

