import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList t = new ArrayList();
        String s;
        int ans = 0;
        for(int i=0;i<N;i++){
            s = sc.next();
            if(!(t.contains(s))){
                t.add(s);
                ans ++;
            }
        }

        System.out.println(ans);

        }


    }