import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];
        int sum=0;
        int min=0,max=0;
        String v = br.readLine();
        String s = br.readLine();
        String[] str = s.split(" ");
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(str[i]);
            min=num[0];
            max=num[0];
            sum += num[i];
            if(max<num[i]){
                max=num[i];
            }
            if(min>num[i]){
                min=num[i];
            }
            //System.out.println(num[i]);
        }
        System.out.println(min+" "+max+" "+sum);
    }
}