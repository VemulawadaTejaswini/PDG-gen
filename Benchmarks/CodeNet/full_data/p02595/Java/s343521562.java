

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int d=Integer.parseInt(s[1].trim());
        long r=(d*d);
        long res=0;
        for(int i=0;i<n;i++){
            s=br.readLine().split(" ");
            int x=Integer.parseInt(s[0].trim());
            int y=Integer.parseInt(s[1].trim());
            if(is_path(x,y,r)){
                res++;
            }
        }
System.out.println(res);
//        int t = Integer.parseInt(br.readLine().trim());

    }

    public static boolean is_path(int x,int y,long d){
        long r=(x*x)+(y*y);
//        r=Math.sqrt(r);
        if(r<=d){
            return true;
        }
        return false;
    }



}
