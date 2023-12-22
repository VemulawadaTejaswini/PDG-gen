import java.util.*;

public class Main {
    static int fun(int a){
        int ans=0;
        while(a/10>0){ans++;a=a/10;}
        return ans+1;
    }
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            System.out.println(fun(s.nextInt()+s.nextInt()));
        }
        
    }
}
