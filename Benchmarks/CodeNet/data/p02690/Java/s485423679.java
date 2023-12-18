import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();
        long S = (long)Math.sqrt(X);

        boolean find = false;
        for(int k = 1 ; k <= S && !find ; k++){
            if((X % k) == 0){
                long Y = X / k;
                int b = 0;
                boolean flag = true;
                while(flag){
                    int var = prodP(b+k, b);
                    if(var == Y){
                        System.out.println(""+(b+k)+" "+b);
                        find = true;
                        flag = false;
                    }else if(var > Y){
                        flag = false;
                    }
                    b++;
                }

                for(b = 0 ; b < k && !flag ; b++){
                    int var = prodM(k-b, b);
                    if(var == Y){
                        System.out.println(""+(k-b)+" "+(-b));
                        find = true;
                        flag = false;
                    }else if(var > Y){
                        flag = false;
                    }
                    b++;
                }
            }
        }

    }

    public static int prodP(int a, int b){
        return a*a*a*a + a*a*a*b + a*a*b*b + a*b*b*b + b*b*b*b;
    }

    public static int prodM(int a, int b){
        return a*a*a*a - a*a*a*b + a*a*b*b - a*b*b*b + b*b*b*b;
    }
}
