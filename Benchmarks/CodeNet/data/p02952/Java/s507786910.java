import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = String.valueOf(n);

        int len = str.length();

        int count = 0;
        for (int i=1; i<=n; i++){
            String st = String.valueOf(i);
            if (st.length()%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}