import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ret = new int[a];
        int wk;
        for(int i =0;i<a;i++){
            wk =sc.nextInt();
            ret[wk-1] = i;
        }
        String retstr = "";
        for(int x : ret){
            retstr += String.valueOf(x) + "";
        }
        System.out.println(retstr.trim());
        sc.close();
    }
}


