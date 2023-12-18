import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int max=0;
        
        for(int i=1;i<=1000;i++){
            for(int k=2;k<=1000;k++){
                if((int)Math.pow(i,k)>x) break;
                if((int)Math.pow(i,k)>max){
                    max=(int)Math.pow(i,k);
                }
            }
        }
        System.out.println(max);
    }
}