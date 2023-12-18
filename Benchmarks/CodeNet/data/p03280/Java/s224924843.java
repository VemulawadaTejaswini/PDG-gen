
import java.util.*;

public class Main {
    static int a,b;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        solve();
    }
    public static void solve(){
        put((a-1)*(b-1));
    }

    public static void put(Object object){
        System.out.println(object);
    }
    public static String format(String string,Object... args){
        return String.format(string,args);
    }

    public static class Pair{
        final public int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
}
