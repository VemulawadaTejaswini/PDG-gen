import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int sum=0;
        int min=1000,max=0;
        String v = br.readLine();
        String s = br.readLine();   //String[]str = br.readLine().split(" ");
        String[] str = s.split(" ");
        
        for(int i=0; i<str.length; i++){
            num = Integer.parseInt(str[i]);
            
            if(max < num) max = num;
            if(min > num) min = num;
            sum += num;
            //System.out.println(num[i]+" "+"min?????°???:"+min+" max?????°???:"+max);
        }
        System.out.println(min+" "+max+" "+sum);
    }
}