import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ret = new int[a];
        int wk;
        for(int i =0;i<a;i++){
            wk =sc.nextInt();
            ret[wk] = i;
        }

        System.out.println(ret.toString());
        sc.close();
    }
}

