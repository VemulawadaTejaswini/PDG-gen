import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());
       
       String a[] = br.readLine().split(" ");
       
       int array[] = new int[n];
       int i=0;
       int left[] = new int[n];
       Map<Integer,Integer> map = new HashMap<>();
       for(String x: a) {
           array[i] = Integer.parseInt(x); 
           left[i] = i+array[i];
           if(map.get(i-array[i])==null)
            map.put(i-array[i],0);
           map.put(i-array[i],map.get(i-array[i])+1);
           i+=1;
       }
       
       int count= 0;
       for( i=0;i<n;i++) {
           if(map.get(left[i])!=null)
           count+=map.get(left[i]);
       }
       
       System.out.println(count);
       
     }
}
