import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[] xi = new int[N];
        int[] yi = new int[N];
        int[] hi = new int[N];
        for(int i = 0;i < N;i++){
            xi[i] = sc.nextInt();
            yi[i] = sc.nextInt();
            hi[i] = sc.nextInt();
        }
        heapsort(hi, xi, yi, N);
        int Cx = 0;
        int Cy = 0;
        int H = 0;
        loop: for(int cx = 0;cx <= 100;cx++){
            for(int cy = 0;cy <= 100;cy++){
                int h = -1;
                int m = 10000;
                for(int i = N-1;i >= 0;i--){
                    int d = Math.abs(xi[i]-cx)+Math.abs(yi[i]-cy);
                    if(h < 0 && hi[i] == 0){
                        m = Math.min(m, d);
                        if(m == 1 && i == 0){
                            Cx = cx;
                            Cy = cy;
                            H = 1;
                            break loop;
                        }
                        continue;
                    }
                    if(hi[i] > 0){
                        if(h < 0){
                            h = d+hi[i];
                        }else if(h-d != hi[i]){
                            break;
                        }
                    }else if(h-d > 0){
                        break;
                    }
                    if(i == 0){
                        Cx = cx;
                        Cy = cy;
                        H = h;
                        break loop;
                    }
                }
            }
        }
        System.out.println(Cx+" "+Cy+" "+H);
    }
    // public static void heapsort(int[] list, int length){
        // public static void heapsort(int[] list, int[] list2, int length){
        public static void heapsort(int[] list, int[] list2, int[] list3, int length){
            /**
             * make a heaptree
             */
            for(int i = 0;i < length;i++){
                int id = i;
                while(true){
                    if(id == 0) break;
                    int nextid = 0;
                    if(id%2 == 1)   nextid = id/2;
                    else    nextid = id/2-1;
                    if(list[id] > list[nextid]){
                        int tmp = list[id];    list[id] = list[nextid];    list[nextid] = tmp;
                        int tmp2 = list2[id];    list2[id] = list2[nextid];    list2[nextid] = tmp2;
                        int tmp3 = list3[id];    list3[id] = list3[nextid];    list3[nextid] = tmp3;
                    }else{
                        break;
                    }
                    id = nextid;
                }
            }
            /**
             * convert from heaptree to sortlist
             */
            int id2 = length-1;
            while(true){
                if(id2 == 0)    break;
                int tmp = list[0];    list[0] = list[id2];    list[id2] = tmp;
                int tmp2 = list2[0];    list2[0] = list2[id2];    list2[id2] = tmp2;
                int tmp3 = list3[0];    list3[0] = list3[id2];    list3[id2] = tmp3;
                int curid = 0;
                id2--;
                if(id2 == 0)    break;
                while(true){
                    int left = (curid+1)*2-1;
                    int rightnum = Integer.MIN_VALUE;
                    int right = (curid+1)*2;
                    if(right <= id2)    rightnum = list[right];
                    int mid = 0;
                    if(list[left] >= rightnum)  mid = left;
                    else    mid = right;
                    if(list[curid] < list[mid]){
                        int tmpp = list[curid];     list[curid] = list[mid];       list[mid] = tmpp;
                        int tmpp2 = list2[curid];     list2[curid] = list2[mid];       list2[mid] = tmpp2;
                        int tmpp3 = list3[curid];     list3[curid] = list3[mid];       list3[mid] = tmpp3;
                    }else{
                        break;
                    }
                    curid = mid;
                    if((curid+1)*2-1 > id2)   break;
                }
            }
        }
}