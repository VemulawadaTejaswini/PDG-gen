import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        int wk = 0;
        for(int i =0 ; i < m;i++){
            wk = sc.nextInt();
            a =a + wk;
        }
        String ret = null ;
        if(n - a > 0){
            ret = "No";
        }else{
            ret = "Yes";
        }

            System.out.println(ret);
        }
    }