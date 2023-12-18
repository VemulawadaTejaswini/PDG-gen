import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());
        int q = sc.nextInt();
        for (int i=0;i<q;i++){
            if (sc.nextInt()==1){
                s.reverse();
            }else {
                if (sc.nextInt()==1){
                    s.insert(0, sc.next());
                }else {
                    s.append(sc.next());
                }
            }

        }
        System.out.println(s);
    }
}
