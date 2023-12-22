import java.io.*;
import java.util.*;

public class Main
{
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        int N=sc.nextInt();
        
        int sum = 0;
        
        for (int i = 0; i < N; i++){
            int temp = sc.nextInt();
            if (map.containsKey(temp)){
                int temp2 = map.get(temp);
                temp2 = temp2 + 1;
                map.put(temp,temp2);
            }else{
                map.put(temp,1);
            }
        }        
        
        int q=sc.nextInt();
        
        for (int i = 0; i < q; i++){
            int temp = sc.nextInt();
            if (map.containsKey(temp)){
                sum = sum +map.get(temp);
            }
        }
     
        System.out.println(sum);
    }
}