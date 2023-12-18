import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>dic=new HashMap<Integer,Integer>();
        int N=sc.nextInt();
        int a[]=new int [N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
            dic.put(a[i],0);
        }
        for(int i=0;i<N;i++){
            dic.put(a[i],dic.get(a[i])+1);
        }
        int ans=0;
        for(Integer key:dic.keySet()){
            if(dic.get(key)%2!=0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}