

import java.util.*;
public class Main {
    public static class Pair{
        int coor;
        long h;
        public Pair(int x,long y) {
            this.coor=x;
            this.h=y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long a = sc.nextLong();
        Pair[] pairs=new Pair[n];
        long total=0;
        for (int i = 0; i < n; i++) {
            int x=sc.nextInt();
            long y=sc.nextLong();
            pairs[i]=new Pair(x,y);
            total+=pairs[i].h;
        }
        long res=0;
        Arrays.sort(pairs,(b,c)->  (b.coor-c.coor));
        int left=0;
        long acc=0;
        while(total>0)
        {
            int right=bs(pairs,left,d);
          long k=(long)((pairs[left].h-acc+0.5)/a);
          total-=(right-left+1)*a*k;
          acc+=a*k;
          res+=k;
          long end=left+2*d;
          int pre=left;
          while(left<n&&left<=end&&pairs[left].h<=acc)
          {
              left++;
          }
          acc=left-pre<=2*d?acc:0;
          if(left==n)break;
        }
        System.out.println(res);
    }
    public static int bs(Pair[] pairs, int start, long d)
    {
        int end=pairs.length;
        int left=0;
        while(left<end){
            int mid=left+(end-left)/2;
            if(pairs[mid].coor-pairs[start].coor<=2*d)
            {
                left=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return left>0?left-1:0;
    }
}
