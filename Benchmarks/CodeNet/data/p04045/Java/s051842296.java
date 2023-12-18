import java.util.*;

public class Main {
    static int[] d;
    static int k;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        d = new int[k];
        for(int i=0;i<k;i++)d[i]=sc.nextInt();
        for (int i = n; ; i++){
            if(like(i)){
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean like(int n){
        String s = String.valueOf(n);
        for(int i=0;i<k;i++){
            String disnum = String.valueOf(d[i]);
            for(int j=0;j<s.length()-disnum.length()+1;j++){
                if(s.substring(j,j+disnum.length()).equals(disnum)){
                    return false;
                }
            }
        }
        return true;

    }
}
