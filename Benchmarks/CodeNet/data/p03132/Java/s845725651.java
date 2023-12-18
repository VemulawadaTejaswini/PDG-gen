import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a[] = new int[l];
        int ce = 0;
        for (int i = 0;i < l;++i){
            a[i] = sc.nextInt();
            if((a[i] & 1) == 0)++ce;
        }
        long min = ce;
        for (int i = 0;i < l;++i){
            if(a[i] == 0)continue;
            for (int j = l;j > i;--j){
                if(a[j - 1] == 0)continue;
                long c = cost(a,i,j,ce);
                if(c == -1)break;
                else{
                    if(min > c)min = c;
                }
            }
        }
        System.out.println(min);

    }

    public static long cost(int[] arr,int start,int end,int ce){
        long c1 = 0;
        long c2 = 0;
        for (int i = 0;i < start;++i){
            c1 += arr[i];
        }
        for (int i = end;i < arr.length;++i){
            c1 += arr[i];
        }
        if(c1 >= ce)return -1;
        boolean b = false;
        for(int i = start;i < end;++i){
            if(!b && i < end - 1 && (arr[i] & 1) == 0 && (arr[i + 1] & 1) == 0)b = true;
            if(i == start || i == end - 1)continue;
            else{
                if(arr[i] == 0){
                    ++c2;
                }
                else if(arr[i] % 2 == 0){
                    ++c2;
                }
            }
        }
        return c1 + c2 + (b ? -1 : 0);
    }
}


