import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        boolean ans=false;
        for(int i=1;i<=100;i++){
            if((a*i-c)%b==0){
                ans=true;
                break;
            }
        }
        if(ans)System.out.println("YES");
        else System.out.println("NO");
    }
}