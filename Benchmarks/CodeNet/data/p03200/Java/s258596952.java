import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.next());
        int count=0;
        try{
            for(;;){
                int p = S.indexOf("BW");
                S.replace(p,p+2,"WB");
                count++;
            }
        }
        catch(Exception e){
        System.out.println(count);
        System.exit(0);
        }
    }
}