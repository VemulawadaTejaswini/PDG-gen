//package  com.company;


import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int prev=-1;
        long ans=0;//1000000*1000000*1000000;
        for(int i=0;i<N;++i){
            int a=sc.nextInt();
            if(prev>a){
                ans+=prev-a;
            }else{
                prev=a;
            }
        }
        System.out.println(ans);
    }
}