import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a[] = new int[l];
        for (int i = 0;i < l;++i){
            a[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        for (int i = 0;i < l;++i){
            if(a[i] == 0)continue;
            for (int j = l;j > i;--j){
                if(a[j - 1] == 0)continue;
                long c = cost(a,i,j);
                if(c == -1)break;
                else{
                    if(min > c)min = c;
                }
            }
        }
        for(int i = 0;i < l - 1;++i){
            if(a[i] % 2 == 0 && a[i + 1] % 2 == 0){
                --min;
                break;
            }
        }
        System.out.println(min);

    }

    public static long cost(int[] arr,int start,int end){
        long c1 = 0;
        long c2 = 0;
        for (int i = 0;i < start;++i){
            c1 += arr[i];
        }
        for (int i = end;i < arr.length;++i){
            c1 += arr[i];
        }
        if(c1 > arr.length)return -1;
        for(int i = start;i < end;++i){
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
        return c1 + c2;
    }
}


