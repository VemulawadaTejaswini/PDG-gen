import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<(1<<n);i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if((1&i>>j)==1) cnt+=a[j];
            }
            mp.put(cnt,1);
        }
        int q=scan.nextInt();
        while(q>0){
            int m=scan.nextInt();
            if(mp.containsKey(m)) System.out.println("yes");
            else System.out.println("no");
            q--;
        }
    }
}
