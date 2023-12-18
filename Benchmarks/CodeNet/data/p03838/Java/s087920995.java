import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans;
        if(x==0) ans = y>0?y:-y+1;
        else if(y==0) ans = x<0?-x:x+1;
        else if(x*y<0) ans = Math.abs(Math.abs(y)-Math.abs(x))+1;
        else{
            if(x<y) ans = y-x;
            else ans = x-y+2;
        }
        System.out.println(ans);

    }
}
