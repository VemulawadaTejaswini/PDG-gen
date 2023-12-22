import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet t = new HashSet();
        String s;
        int ans = 0;
        for(int i=0;i<N;i++){
            s = sc.next();
            if(!t.contains(s)){
                t.add(s);
                ans ++;
            }
        }

        System.out.println(ans);

        }


    }