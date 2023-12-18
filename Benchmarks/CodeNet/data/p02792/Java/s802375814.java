

import java.util.*;

class Main {
    public static void main(String args[]){

        Scanner s=new Scanner(System.in);
        Integer n= s.nextInt();
        int count=0;
        for (int i = 1; i <=n ; i++) {
            //さいしょのもじ
            int ns=String.valueOf(i).charAt(0)-'0';
            int nf=i%10;
            for (int j = 0; j <n ; j++) {
                int js=String.valueOf(j).charAt(0)-'0';
                int jf=j%10;
                if(ns==jf&&nf==js){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}