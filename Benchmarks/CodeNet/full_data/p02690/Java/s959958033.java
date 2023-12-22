import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 1;
        int ans1 = 0;
        int ans2 = 0;
        if(a!=1){
            for(int l=2;l<a;l++){
                if(a%l==0){
                    b=l;
                    break;
                }
            }
            for(int i=0;i<b;i++){
                int x = (int)Math.pow(b-i,5);
                int y = (int)Math.pow(-i,5);
                int p = x-y;
                if(a==p){
                    ans1=b-i;
                    ans2=-(i);
                    break;
                }
            }
        }else{
            ans1=1;
            ans2=0;
        }
        System.out.print(ans1);
        System.out.print(" ");
        System.out.print(ans2);
    }
}
