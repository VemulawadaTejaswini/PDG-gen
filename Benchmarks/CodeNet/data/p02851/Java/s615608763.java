import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
      int n=s.nextInt(),k=s.nextInt();
      long[] arr=new long[n+1];
      long sum=0; long res=0;
      for(int i=1;i<=n;i++){
        int p=s.nextInt();
        sum+=p;
        //if(p%k==1){res++;}
        arr[i]=(sum-i)%k;
        //System.out.print(arr[i]+" ");
      }
      Map<Long,Long>map=new HashMap<>();
     map.put(0l,1l); 
      int j=0;
      for(int i=1;i<=n;i++){
        if(i-j+1>k){
          map.put(arr[j],map.get(arr[j])-1);
          if(map.get(arr[j])==0){
            map.remove(arr[j]);
          }
          j++;
        }
          //System.out.println(arr[i]);
          res+=map.getOrDefault(arr[i],0l);
         map.put(arr[i],map.getOrDefault(arr[i],0l)+1);
      }
        System.out.println(res);
        }
    }
