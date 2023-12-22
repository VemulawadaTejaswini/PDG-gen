import java.io.*;
import java.util.*;


public class Main{
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            Map<Integer, Integer> map = new TreeMap<>();
            int weight = 0;
            while(true){
                Integer n =  Integer.parseInt(br.readLine());
                if(n == 0)break;
                for(int i = 0; i < n;i++){
                    String[] arg = br.readLine().split(" ");
                    map.put(Integer.parseInt(arg[0]), Integer.parseInt(arg[1]));
                }
                for(Integer key: map.keySet()){
                    weight += key;
                    if(weight > map.get(key)){
                        System.out.println("NO");
                        weight = 0;
                        break;
                    }
                }
                if(weight != 0){
                    System.out.println("YES");
                    weight = 0;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String... args){
        new Main().run();
    }
}