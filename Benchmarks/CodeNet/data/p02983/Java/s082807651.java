import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int L =scn.nextInt();
        int R =scn.nextInt();
        if(R-L>=2019) R=L+2019;
        int min0=2019;
        int min1=2019;
        for(int i=L;i<=R;i++){
            int buf=i%2019;
            if(min0>buf){
                min1=min0;
                min0=buf;
            }else if(min1>buf){
                min1=buf;
            }
        }
        System.out.println(min1*min0);
    }
}
