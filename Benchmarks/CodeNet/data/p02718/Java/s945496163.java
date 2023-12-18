
import java.util. ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        while(sc.hasNext()== true ){
            a.add(sc.nextInt());
        }
        int sumo = 0;
        for (int i =0; i<a.size(); i++){
            sumo += a.get(i);
        }
        sumo -= a.get(0);
        sumo -= a.get(1);
        int ans = a.get(0) - sumo;
        if( a.get(0)< sumo){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}



/*

n m
a

n種類の商品からm個選ぶ
ただし、mに該当するものはsum(a1~ai)の1/4M以上じゃなければいけない
m個ちゃんと選べるならYes,選べないならNo

Collections.Max

*/

import java.lang.Math;
import java.util.Collections;
import java.util. ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> a = new ArrayList<>();
        while(sc.hasNext()== true ){
            a.add(sc.nextLong());
        }
        long sumo = 0;
        for (int i =0; i<a.size(); i++){
            sumo += a.get(i);
        }
        long n = a.get(0);
        long m = a.get(1);
        String ans = null;
        sumo = sumo - (n + m);
        int cnt = 0;
        //sumoがaの総和になった
        //ここから最大値をm個とる
        long thres = Math.round(sumo/(4*m));
        for (long i=0; i < m; i++){
            long b = Collections.max(a);
            if (b >= thres){
                cnt +=1;
                a.remove(a.indexOf(b));
            }else{
                a.remove(a.indexOf(b));
            }
        }
        if (cnt >= m){
            ans = "Yes";
        }else{
            ans ="No";
        }
        System.out.println(ans);
    }
}
