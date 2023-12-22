import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x,y,p,q,tmp;
        x=scan.nextInt();
        y=scan.nextInt();
        
        p=Math.max(x,y);
        q=Math.min(x,y);
        while(p%q!=0){
            tmp=p%q;
            p=q;
            q=tmp;
        }
        System.out.println(q);
    }
}
