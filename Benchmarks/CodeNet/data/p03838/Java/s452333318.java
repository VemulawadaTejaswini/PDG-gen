import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int ans;
        if(x*y==0) ans = Math.abs(Math.abs(y)-Math.abs(x));
        else if(x*y<0) ans = Math.abs(Math.abs(y)-Math.abs(x))+1;
        else{
          if(x<y) ans = y-x;
          else ans = x-y+2;
        }
        System.out.println(ans);
        
    }
}
