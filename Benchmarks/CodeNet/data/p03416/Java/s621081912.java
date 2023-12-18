import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=0;
        for(int i=a;i<=b;i++){
            if(((i/10000)==(i%10))&&((i/1000)%10==(i/10)%10)){
                ans++;
            }
        }
    System.out.println(ans);
     }
}