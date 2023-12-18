/*
このプロジェクトの用途を書いてください
*/

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int p=scanner.nextInt();

        int even=0;
        for(int i=0;i<n;i++){
            if(scanner.nextInt()%2==0){
                even++;
            }
        }
        int odd=n-even;

        double e=0;
        for(int i=0;i<even+1;i++){
            e+=combi(even,i);
        }

        int o=0;
        if(p==0){
            for(int i=0;i<odd+1;i+=2){
                o+=combi(odd,i);
            }
        }else{
            for(int i=1;i<odd+1;i+=2){
                o+=combi(odd,i);
            }
        }
        System.out.println(e);
        System.out.println(o);
        System.out.println(e*o);
    }

    private static double factorial(int i){
        double j=1;
        while(i>1){
            j*=i--;
        }
        return j;
    }

    private static double combi(int i,int j){
        double f=factorial(i);
        double g=factorial(i-j);
        double h=factorial(j);
        double r=f/(g*h);
        return r;
    }
}