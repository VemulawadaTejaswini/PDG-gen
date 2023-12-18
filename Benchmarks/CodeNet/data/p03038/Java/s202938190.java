
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            A.add(sc.nextInt());
        }
        A.sort(null);

        int[] B = new int[M];
        int[] C = new int[M];

        for(int j=0; j<M; j++){
            B[j] = sc.nextInt();
            C[j] = sc.nextInt();
        }

        sc.close();

        sort(C, B);


        for(int j=M-1; j>=0; j--){

            if(C[j] <= A.get(0)){
                break;
            }

            for(int k=0; k<B[j]; k++){
                if(A.get(k) >= C[j]){
                    break;
                }
                A.set(k, C[j]);
            }
            A.sort(null);
        }




        BigInteger sum = BigInteger.ZERO;

        for(int i=0; i<N; i++){
            sum = sum.add(BigInteger.valueOf(A.get(i)));
        }

        System.out.println(sum);

    }


    /*
     * 軸要素の選択
     * 順に見て、最初に見つかった異なる2つの要素のうち、
     * 大きいほうの番号を返します。
     * 全部同じ要素の場合は -1 を返します。
     */
    static int pivot(int[] a,int i,int j, int[] b){
        int k=i+1;
        while(k<=j && a[i]==a[k]) k++;
        if(k>j) return -1;
        if(a[i]>=a[k]) return i;
        return k;
    }

    /*
     * パーティション分割
     * a[i]～a[j]の間で、x を軸として分割します。
     * x より小さい要素は前に、大きい要素はうしろに来ます。
     * 大きい要素の開始番号を返します。
     */
    static int partition(int[] a,int i,int j,int x, int[] b){
        int l=i,r=j;

        // 検索が交差するまで繰り返します
        while(l<=r){

            // 軸要素以上のデータを探します
            while(l<=j && a[l]<x)  l++;

            // 軸要素未満のデータを探します
            while(r>=i && a[r]>=x) r--;

            if(l>r) break;
            int t=a[l];
            a[l]=a[r];
            a[r]=t;

            int tb=b[l];
            b[l]=b[r];
            b[r]=tb;

            l++; r--;
        }
        return l;
    }

    /*
     * クイックソート（再帰用）
     * 配列aの、a[i]からa[j]を並べ替えます。
     */
    public static void quickSort(int[] a,int i,int j, int[] b){
        if(i==j) return;
        int p=pivot(a,i,j, b);
        if(p!=-1){
            int k=partition(a,i,j,a[p], b);
            quickSort(a,i,k-1, b);
            quickSort(a,k,j, b);
        }
    }

    /*
     * ソート
     */
    public static void sort(int[] a, int[] b){
        quickSort(a,0,a.length-1, b);
    }

}