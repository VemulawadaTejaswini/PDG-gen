import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
 
class Main {
    public static void main(String[] args){
        try {
 
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        Restaurant rr[] = new Restaurant[N];
 
        for(int i = 0; i < N; i++){
            String str[] = (br.readLine()).split("\\s+");
            rr[i] = new Restaurant(str[0],Integer.parseInt(str[1]),i+1);
        }
 
        QuickSort(rr, 0, N-1);
        // 標準出力
        for(Restaurant node : rr) { pw.println(node.i); }
 
        pw.flush();
 
        } catch(IOException e) { System.out.println("Exception :" + e); }
    }
 
    static void QuickSort (Restaurant rr[], int left, int right) {
        /*配列の個数を計算する*/
        if((right - left + 1) == 0)
            return;
 
        int i = left, j = right;
 
        /*与えられたインデックス間の乱数をとる*/
        Random random = new Random();
        Restaurant temp = new Restaurant();
        Restaurant p = rr[random.nextInt(right - left + 1) + left].copy();
 
        while(true){
            while( rr[i].compare(p) < 0 && i < right)
                i++;
 
            while( rr[j].compare(p) > 0 && j > left)
                j--;
 
            if(i >= j)
                break;
            else{
                temp = rr[i].copy();
                rr[i] = rr[j].copy();
                rr[j] = temp.copy();
                i++; j--;
            }
        }
        if(left < i-1)
            QuickSort(rr, left, i-1);
        if(j+1 < right)
            QuickSort(rr, j+1, right);
    }
 
}
 
class Restaurant {
    String S;
    int P,i;
 
    Restaurant () {
        this("NO NAME",-1,-1);
    }
 
    Restaurant (String S, int P, int i) {
        this.S = S; this.P = P; this.i = i;
    }
 
    // Restaurantクラスの比較メソッド
    int compare (Restaurant rr) {
        if ((this.S).compareTo(rr.S) < 0)
            return -1;
        else if ((this.S).compareTo(rr.S) > 0)
            return 1;
        else return rr.P - this.P;
    }
 
    // Resturantクラスの複製メソッド
    Restaurant copy () {
        Restaurant rr = new Restaurant(this.S,this.P, this.i);
        return rr;
    }
}