import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.next());
        int second = Integer.parseInt(sc.next());
        String postCd = sc.next();
        for(int x=1; x<=first;x++) {
            try {
                Integer.parseInt(postCd.substring(x-1,x));
            } catch(Exception e){
                System.out.println("No");
                return;
            }
        }
        if(!postCd.substring(first,first+1).equals("-")) {
            System.out.println("No");
            return;
        }
        for(int x=first+2; x<=first+second+1;x++) {
            try {
                Integer.parseInt(postCd.substring(x-1,x));
            } catch(Exception e){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
