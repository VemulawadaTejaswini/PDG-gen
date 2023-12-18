import java.util.*;

public class Main {
    static long[] nums;
    static int n;
    static int m;
    static int v;
    static int p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        v=sc.nextInt();
        p=sc.nextInt();
        nums=new long[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        int now=n/2;
        int toadd=n/2;
        boolean ablenow;
        boolean ablenext;
        while(true){
            if(now<=-1||now>=n-1){
                break;
            }
            ablenow=isable(now);
            ablenext=isable(now+1);
            
            if(!ablenow&&ablenext){
                break;
            }else if(ablenow){
                now-=Math.max(1,toadd/=2);
                
            }else{
                now+=Math.max(1,toadd/=2);
            }
        }
        System.out.println(n-now-1);
        

    }
    static boolean isable(int index){
        long max=nums[index]+m;
        long rest=(v-1)*m;
        int count=p-1;
        for(int i=n-1;i>=0;i--){
            if(i==index)continue;
            if(count>0&&rest>=m){
                rest-=m;
                count--;
            }else if(rest<1){
                return true;
            }else if(nums[i]<=max){
                long tmp=Math.min(rest, Math.min(m, max-nums[i]));
                rest-=tmp;
            }else if(nums[i]>max){
                return false;
            }
            
        }
        if(rest>0){
            return false;
        }
        return true;
    }

}
