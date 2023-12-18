import java.util.*;

import jdk.nashorn.internal.runtime.arrays.IntOrLongElements;

public class Main{
    static ArrayList<int[]> abc;
    static int n, ma, mb;
    static int opt=Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=Integer.parseInt(sc.next());
        ma=Integer.parseInt(sc.next());
        mb=Integer.parseInt(sc.next());
        abc=new ArrayList<int[]>();
        int a,b,c;
        for(int i=0;i<n;i++){
            a=Integer.parseInt(sc.next());
            b=Integer.parseInt(sc.next());
            c=Integer.parseInt(sc.next());
            int[] abc_i={a, b, c};
            abc.add(abc_i);
            // abc.add(new ArrayList<Integer>(Arrays.asList(a,b,c)));
        }
        sc.close();
        Collections.sort(abc,(arr1,arr2)->{
            if(arr1[2]>arr2[2]) return 1;
            else if(arr1[2]<arr2[2]) return -1;
            else return 0;
        });
        int ans=search(0, 0, 0, 0);
        if(ans==Integer.MAX_VALUE) ans=-1;
        System.out.println(ans);

    }

    public static int search(int sumA, int sumB, int sumC, int st){
        if(sumC>=opt) return Integer.MAX_VALUE;
        int a=abc.get(st)[0];
        int b=abc.get(st)[1];
        int c=abc.get(st)[2];
        if(sumA*mb==sumB*ma && sumA!=0){ 
            opt=sumC;
            return sumC;
        }
        else if((sumA+a)*mb==(sumB+b)*ma){
            if(sumC+c>=opt) return Integer.MAX_VALUE;
            opt=sumC+c;
            return sumC+c;
        }
        else{
            if(st==n-1) return Integer.MAX_VALUE;
            else return Math.min(search(sumA+a, sumB+b, sumC+c, st+1), search(sumA, sumB, sumC, st+1));
        }   
    }

}