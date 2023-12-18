import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] t = new int[N];
        int [] x = new int[N];
        int [] y = new int[N];
        String str = "Yes";
        int flag = 0;

        for(int i = 0 ; i < N ; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N ; i++){
            if( (t[i] % 2 == 1) && (((x[i] + y[i])) % 2 == 1 ) && (((x[i] + y[i])) <= t[i])){
                continue;
            }
            else if ((t[i] % 2 == 0) && (((x[i] + y[i])) % 2 == 0 ) && (((x[i] + y[i])) <= t[i])) {
                continue;
            }

            else{
                flag = 1;
            }
        }

        if(flag == 1){
            str = "No";
        }

        System.out.println(str);
    }
}