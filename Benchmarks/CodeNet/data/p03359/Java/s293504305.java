import java.util.*;

public class HelloWorld{

    public static void main(String[] args){
        
        /*
        InputStreamReader is = new InputStreamReader(System.in);       
        BufferedReader br = new BufferedReader(is);     
        */
        Scanner scan = new Scanner(System.in);


        int a,b;
        a = Integer.parseInt(scan.next());   
        b = Integer.parseInt(scan.next());
        int ans;
        ans = a;
        
        if(a > b){
            ans--;
        }

        System.out.println(ans);
    }
}
