
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int a=Integer.parseInt(s[0].trim());
        int b=Integer.parseInt(s[1].trim());
        int c=Integer.parseInt(s[2].trim());
        int k=Integer.parseInt(br.readLine().trim());

        if(check(a,b,c)){
            System.out.println("YES");
        }
        else {
            while (k-- > 0) {
                if (a >= b) {
                    b = b * 2;
                } else if (c <= b) {
                    c = c * 2;
                }
                if (check(a, b, c)) {
                    System.out.println("YES");
                }
            }
            if (!check(a, b, c)) {
                System.out.println("NO");
            }
        }
//        System.out.println(");





    }

    public static boolean check(int a,int b,int c){
        if(b>a && c>b){
            return true;
        }
        return false;
    }




}
