import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] d = new String[k];
        for (int i=0;i<k;i++){
            d[i]=sc.next();
        }
        boolean b = true;
        while (b){
            String[] s = Integer.toString(n).split("");
            boolean c = true;
            for (int i=0;i<s.length&&c;i++){
                for (int j=0;j<k&&c;j++){
                    if (s[i].equals(d[j]))c=false;
                }
            }
            if (c){
                b=false;
                System.out.println(n);
            }
            n++;
        }
    }
}