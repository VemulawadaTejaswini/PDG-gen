import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        
        while ((n = sc.nextInt())!=0){
            int sum = 0;
            int max=0,min=1000;
            for(int i=0;i<n;i++){
                int num = sc.nextInt();
                sum += num;
                if(max<num) max=num;
                if(min>num) min=num;
            }
            sum -= max;
            sum -= min;
            
            System.out.println(sum/(n-2));
        }
        
    }
}