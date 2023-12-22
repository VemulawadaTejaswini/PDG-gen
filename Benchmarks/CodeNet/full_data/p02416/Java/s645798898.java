import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String x = sc.next();
            int p = x.length();
            int a = 0;

            if(x.equals("0")){
                break;
            }else{
                for(int i=0;i<p;i++){
                    a += (x.charAt(i) - '0');
                }
                System.out.println(a);
            }
        }
        sc.close();
    }
}
