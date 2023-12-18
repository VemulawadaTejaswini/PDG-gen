
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String ss=br.readLine();
            int n=ss.length();
            String sk=ss.substring(0,(n-1)/2);
            String ks=ss.substring((n+3)/2 -1);
            //System.out.println(ss+" "+sk+" "+ks);
            if(isPal(ss) && isPal(sk) && isPal(ks)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }




        }catch(Exception e){
            System.out.println("kkkk");
        }
    }
    static boolean isPal(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    static class pair{
        int a,b;
        public pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}