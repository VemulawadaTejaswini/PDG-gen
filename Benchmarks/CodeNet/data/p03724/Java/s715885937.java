import java.io.*;
import java.util.*;

public class Main{
    public void run(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String[] arg = br.readLine().split(" ");
            int n = Integer.parseInt(arg[0]);
            int m = Integer.parseInt(arg[1]);
            int[] array = new int[m-1];
            for(int i = 0 ;i < m; i++){
                String[] input = br.readLine().split(" ");
                for(int j = Integer.parseInt(input[0]) - 1; j < Integer.parseInt(input[1]) - 1; j++)
                    array[j] += 1;
            }
            boolean flag = true;
            for(int a : array){
                if(a % 2 != 0){
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
