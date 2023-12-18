import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,w,h,x,y,tmp,i;
        w=scan.nextInt();
        h=scan.nextInt();
        n=scan.nextInt();
        x=Math.min(w,h);
        y=Math.max(w,h);
        tmp=0;
        for(i=1;i<=x;i++){
            tmp+=y;
            if(tmp>=n) break;
        }
        System.out.println(i);
    }
}