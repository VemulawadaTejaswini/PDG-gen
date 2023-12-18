

import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        int m=s.nextInt();

        int[] ret=new int[3];
        for (int i = 0; i <n ; i++) {
            ret[i]=0;
        }
        HashMap<Integer,Integer> setted=new HashMap<>();
        for (int i = 0; i <m ; i++) {
            int ss=s.nextInt();
            int cc=s.nextInt();
            if(setted.get(ss)!=null&&cc!=setted.get(ss)){
                System.out.println("-1");
                return;
            }
            setted.put(ss,cc);
            ret[ss-1]=cc;
        }

        int va=Integer.parseInt(""+ret[0]+ret[1]+ret[2]);
        if(String.valueOf(va).length()!=n){
            System.out.println("-1");
            return;
        }
        System.out.println(va);

    }
}
