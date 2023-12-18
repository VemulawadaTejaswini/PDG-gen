import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String slist[] = s.split(",");;
        for(int i = 0 ; i < 3 ; ++i){
            System.out.print(slist[i] + " ");
        }
    }
}
