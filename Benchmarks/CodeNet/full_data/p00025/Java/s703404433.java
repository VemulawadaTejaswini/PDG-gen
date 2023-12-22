import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int a[] = new int[4], b[] = new int[4];
            for(int i=0; i<4; i++) a[i] = in.nextInt();
            for(int i=0; i<4; i++) b[i] = in.nextInt();
            System.out.println(countHit(a,b) + " " + countBlow(a,b));
        }
    }
    static int countHit(int[] a,int[] b){
        int cnt=0;
        for(int i=0;i<4;i++)if(a[i]==b[i])cnt++;
        return cnt;
    }
    static int countBlow(int[] a,int[] b){
        int cnt=0;
        for(int i=0;i<4;i++)if(a[i]!=b[i])
            for(int j=0;j<4;j++)if(i!=j&&a[i]==b[j]){
                cnt++;
                break;
            }
        return cnt;
    }
}
//by Tuvshee 12.05.2012