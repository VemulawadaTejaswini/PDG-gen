import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        int taro =0;
        int hana =0;
        String[] temp = new String[2];

        while((str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            for(int i=0;i<n;i++){
                str = br.readLine();
                temp = str.split("\\s");
                String t =temp[0].substring(0,1);
                String h = temp[1].substring(0,1);
                int num = t.compareTo(h);

                System.out.println(t + h + num);
                if(num == 0){
                    taro++;
                    hana++;
                }else if(num < 0){
                    taro +=3;
                }else{
                    hana +=3;
                }
            }
        }

        System.out.println(taro + " " + hana);

    }
}