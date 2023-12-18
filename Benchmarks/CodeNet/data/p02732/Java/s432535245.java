import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        int[] a=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int ball=sc.nextInt();
            a[i]=ball;
            if(map.get(ball)==null)map.put(ball,new ArrayList<>());
            map.get(ball).add(i);
        }

        int sum=0;
        for(int ball:map.keySet()){
            int s=map.get(ball).size();
            sum+=s*(s-1)/2;
        }
        for(int k=1;k<=n;k++){
            int res=sum;
            int ball=a[k];
            int s=map.get(ball).size();
            res-=s-1;
            System.out.println(res);
        }
    }
}