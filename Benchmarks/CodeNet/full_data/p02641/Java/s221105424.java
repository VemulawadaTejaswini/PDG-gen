import java.util.Scanner;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int count1=0;
        int count2=0;
        int plus=0;
        int minus=0;
        int flg=0;
        if(n==0){
            System.out.println(x);
        }else{
        int[] list = new int[n];
        for(int i=0; i<list.length; i++){
            list[i]=sc.nextInt();
        }
        while(true){
            for(int i=0; i<list.length; i++){
                if(list[i]==x+plus){
                    plus++;
                }
            }
            count1++;
            if(count1>plus){
                break;
            }
        }
        while(true){
            for(int i=0; i<list.length; i++){
                if(list[i]==x+minus){
                    minus--;
                }
            }
            count2--;
            if(count2<minus){
                break;
            }
        }
        flg=plus+minus;
        if(flg>=0){
            System.out.println(x+minus);
        }else if(flg<0){
            System.out.println(x+plus);
        }
    }
}
}