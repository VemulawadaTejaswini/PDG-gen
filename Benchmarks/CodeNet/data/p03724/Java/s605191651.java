import java.io.*;
import java.util.*;

public class Main{
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] arg = br.readLine().split(" ");
            int n = Integer.parseInt(arg[0]);
            int m = Integer.parseInt(arg[1]);
            int[] array = new int[m-1];
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0 ;i < m; i++){
                String[] input = br.readLine().split(" ");
                if(!map.containsKey(Integer.parseInt(input[0])))
                    map.put(Integer.parseInt(input[0]), 1);
                else
                    map.put(Integer.parseInt(input[0]), map.get(Integer.parseInt(input[0])) + 1);
                if(!map.containsKey(Integer.parseInt(input[1])))
                    map.put(Integer.parseInt(input[1]), 1);
                else
                    map.put(Integer.parseInt(input[1]), map.get(Integer.parseInt(input[1])) + 1);
            }
            boolean flag = true;
            for(int a : map.keySet()){
                if(map.get(a) % 2 != 0){
                    flag = false;
                    break;
                }
            }
            if(flag)System.out.println("YES");
            else System.out.println("NO");
        }catch(Exception e){

        }
    }
    public static void main(String... args){
        new Main().run();
    }
}
