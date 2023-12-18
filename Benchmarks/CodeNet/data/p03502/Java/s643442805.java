import java.util.*;

public class Main {
    static boolean[] bits;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x=sc.next();
        int mod=0;
        for(int i=0;i<x.length();i++){
            mod+=Integer.parseInt(x.substring(i,i+1));
        }
        System.out.println(Integer.parseInt(x)%mod==0?"Yes":"No");
  

    }
    
}