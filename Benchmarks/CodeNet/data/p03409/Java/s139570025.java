import java.util.*;
 
public class Main{
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] b = new int[n];
        int[] c=new int[n];
       int[] used=new int[n];
      int ans=0;
       HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
       HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++){
         int a = in.nextInt();
         b[i]=in.nextInt();
        map1.put(b[i],a);
      }
 for(int i=0;i<n;i++){
       c[i]=in.nextInt();
         int d = in.nextInt();
        map2.put(c[i],d);
      }
     Arrays.sort(b);
     Arrays.sort(c);
    for(int i=0; i<n;i++){
      for(int j=n-1;j>=0;j--){
         if(c[i]>map1.get(b[j]) && map2.get(c[i])>b[j]&&used[j]==0){
          ans++;
          used[j]=1;
           break;
       }
     }
}
 System.out.println(ans);
    }}