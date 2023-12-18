
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                String ss=br.readLine();
                int n=Integer.parseInt(ss);
                String[] sk=br.readLine().split(" ");
                HashMap<Long,Long> map=new HashMap<>();
                long[] arr=new long[n];
                for(int i=0;i<n;i++){
                    long y=Long.parseLong(sk[i]);
                    arr[i]=y;
                    if(map.containsKey(y)){
                        map.put(y,map.get(y)+1);
                    }else{
                        map.put(y,(long)1);
                    }
                }
            Iterator it=map.entrySet().iterator();
            long y=0;
            while(it.hasNext()){
                Map.Entry element=(Map.Entry)it.next();

                long val=(long)element.getValue();
                y+=val*(val-1)/2;

            }
                for(int i=0;i<n;i++){
                    long u=arr[i];
                    long l=map.get(u);
                    long p= y- (l*(l-1))/2 + ((l-1)*(l-2))/2;
                    System.out.println(p);
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