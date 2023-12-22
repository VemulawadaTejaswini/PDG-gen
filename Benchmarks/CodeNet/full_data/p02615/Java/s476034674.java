import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        long arr[]=new long[x];
        for(int i=0;i<x;i++)
          arr[i]=sc.nextLong();
        Arrays.sort(arr);
        long sum=0;
        for(int i=1;i<x;i++)
          sum+=arr[i];
        System.out.println(sum);
     }
}