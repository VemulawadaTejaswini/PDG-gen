
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
                HashMap<Integer,Integer> map=new HashMap<>();
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                    int y=Integer.parseInt(sk[i]);
                    arr[i]=y;
                    if(map.containsKey(y)){
                        map.put(y,map.get(y)+1);
                    }else{
                        map.put(y,1);
                    }
                }
                for(int i=0;i<n;i++){
                    int u=arr[i];
                    Iterator it=map.entrySet().iterator();
                    long y=0;
                    while(it.hasNext()){
                        Map.Entry element=(Map.Entry)it.next();
                        int key=(int)element.getKey();
                        int val=(int)element.getValue();

                            if (key == u) {
                                y += ((val-1)*(val-2))/2;
                            }else{
                                y+=(val*(val-1))/2;
                            }

                    }
                    System.out.println(y);
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