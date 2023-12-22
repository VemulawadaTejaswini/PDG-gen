import java.util.*;
public class Main{
    
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int w,h,x,y,r;
        w=in.nextInt();
        h=in.nextInt();
        x=in.nextInt();
        y=in.nextInt();
        r=in.nextInt();
        if(isInside(w,h,x,y,r)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        in.close();
    }
    
    public static boolean isInside(int w,int h,int x,int y,int r){
        if(x-r>=0&&x+r<=w&&y+r<=h&&y-r>=0){
            return true;
        }
        return false;
    }
}
