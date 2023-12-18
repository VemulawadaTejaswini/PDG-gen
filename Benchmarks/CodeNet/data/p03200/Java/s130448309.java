import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count=0;
    
    for(;;){
        String tmp = S;
        tmp = tmp.replace("BW","");
        if(S.length()==tmp.length()){
            System.out.println(count);
            System.exit(0);
        }
        count += (S.length()-tmp.length())/2;
        S=S.replace("BW","WB");
        }
    }
}
