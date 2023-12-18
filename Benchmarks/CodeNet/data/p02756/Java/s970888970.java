import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();

        for (int i=0; i<q; i++){
            int query = sc.nextInt();
            if (query==1){
                StringBuffer str = new StringBuffer(s);
                s = str.reverse().toString();

            }else if (query==2){
                int tmpInt = sc.nextInt();
                if (tmpInt==1){
                    String c = sc.next();
                    s = c+s;
                }else if (tmpInt==2){
                    String c = sc.next();
                    s = s+c;
                }
            }
        }
        System.out.print(s);

    }
}

