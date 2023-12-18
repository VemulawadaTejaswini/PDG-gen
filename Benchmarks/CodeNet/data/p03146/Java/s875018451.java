import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int pre = s;
        boolean con = true;
        int ans = 1;
        boolean[] c = new boolean[1000000];
        while(con){
            ans++;
            int b;
            if(pre %2 == 0){
                b = pre /2;
            }else{
                b = 3 * pre +1;
            }
            if(c[b]) break;
            else {
                c[b] = true;
                pre = b;
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
