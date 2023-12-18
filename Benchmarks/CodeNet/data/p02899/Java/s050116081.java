import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int[] ret = new int[a];
        int wk;
        for(int i =0;i<a;i++){
            wk =Integer.parseInt(sc.next());
            ret[wk-1] = i;
        }
        String retstr = "";
        for(int x : ret){
            retstr = String.valueOf(x);
        }
        System.out.println(retstr.trim());
        sc.close();
    }
}