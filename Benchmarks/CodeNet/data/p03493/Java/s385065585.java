import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String str = sc.next();
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(count);
    }
}
