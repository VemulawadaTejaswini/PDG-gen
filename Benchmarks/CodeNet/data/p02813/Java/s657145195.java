import java.util.*;

public class Main{
    static class IntArrayUtil{
        static void reverse(int[] a, int begin, int end){
            for(int i=begin;i<begin+(end-begin)/2;i++){
                swap(a, i, begin+end-i-1);
            }
        }
        static void reverse(int[] a){
            reverse(a, 0, a.length);
        }
        static void revSort(int[] a){
            Arrays.sort(a);
            reverse(a);
        }
        static int[] nextPermutation(int[] a){
            int[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]>ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]>ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        static int[] predPermutation(int[] a){
            int[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]<ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]<ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        static void swap(int[] a, int u, int v){
            int tmp=a[u];
            a[u]=a[v];
            a[v]=tmp;
        }
        static int compare(int[] a, int[] b){
            for(int i=0;i<a.length;i++){
                if(i>=b.length){
                    return -1;
                } else if(a[i]>b[i]){
                    return 1;
                } else if(a[i]<b[i]){
                    return -1;
                }
            }
            if(a.length<b.length){
                return 1;
            } else{
                return 0;
            }
        }
        static boolean equals(int[] a, int[] b){
            return compare(a, b)==0;
        }
    }
    
    static class LongArrayUtil{
        static void reverse(long[] a, int begin, int end){
            for(int i=begin;i<begin+(end-begin)/2;i++){
                long tmp=a[i];
                a[i]=a[begin+end-i-1];
                a[begin+end-i-1]=tmp;
            }
        }
        static void reverse(long[] a){
            reverse(a, 0, a.length);
        }
        static void revSort(long[] a){
            Arrays.sort(a);
            reverse(a);
        }
        static long[] nextPermutation(long[] a){
            long[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]>ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]>ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        static long[] predPermutation(long[] a){
            long[] ret=a.clone();
            int n=ret.length;
            for(int i=n-1;i>=1;i--){
                if(ret[i]<ret[i-1]){
                    int fail=n, pass=i;
                    while(fail-pass>1){
                        int mid=pass+(fail-pass)/2;
                        if(ret[mid]<ret[i-1]) pass=mid;
                        else fail=mid;
                    }
                    swap(ret, pass, i-1);
                    reverse(ret, i, n);
                    return ret;
                }
            }
            return null;
        }
        static void swap(long[] a, int u, int v){
            long tmp=a[u];
            a[u]=a[v];
            a[v]=tmp;
        }
        static int compare(long[] a, long[] b){
            for(int i=0;i<a.length;i++){
                if(i>=b.length){
                    return -1;
                } else if(a[i]>b[i]){
                    return 1;
                } else if(a[i]<b[i]){
                    return -1;
                }
            }
            if(a.length<b.length){
                return 1;
            } else{
                return 0;
            }
        }
        static boolean equals(long[] a, long[] b){
            return compare(a, b)==0;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] p=new long[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        long[] q=new long[n];
        for(int i=0;i<n;i++){
            q[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<n;i++){
            if(p[i]>q[i]){
                System.out.println(diff(p, q));
                return;
            } else if(p[i]<q[i]){
                System.out.println(diff(q, p));
                return;
            }
        }
        System.out.println(0);
    }
    public static int diff(long[] p, long[] q){
        int cnt=0;
        while(true){
            p=LongArrayUtil.predPermutation(p);
            cnt++;
            if(LongArrayUtil.equals(p, q)){
                return cnt;
            }
        }
    }
}