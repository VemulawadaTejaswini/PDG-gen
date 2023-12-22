import java.util.*;
public class Main {
    private static int cnt = 0;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] pt = new int[n];
        int [] it = new int[n];
        for(int i=0;i<n;i++) pt[i] = sc.nextInt();
        for(int i=0;i<n;i++) it[i] = sc.nextInt();
        reconstruction(0,n,0,pt,it);
        System.out.println();
    }
    public static int getindex(int [] L,int  value){
        for(int i=0;i<L.length;i++) if(L[i] == value) return i;
        return -1;
    }
    public static int  reconstruction(int l,int r,int pre_id,int [] pt,int [] it){
        if(l<r){
            int next_value = pt[pre_id++];
            int it_id = getindex(it,next_value);
            pre_id = reconstruction(l,it_id,pre_id,pt,it);
            pre_id = reconstruction(it_id+1,r,pre_id,pt,it);
            if(cnt==pt.length-1) System.out.print(next_value);
            else{
                System.out.print(next_value+" ");
                cnt++;
            }
        }
        return pre_id;
    }
}
