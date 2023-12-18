
import java.lang.reflect.Array;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int l;

        sc.nextLine();

        String s = sc.nextLine();
        String t = sc.nextLine();

        l = lcm(n,m);

        int n_ans;
        int m_ans;

        n_ans = l / n;
        m_ans = l / m;

        int l_ans;

        int temp_s = 0;
        int temp_t = 0;

        l_ans = lcm(n_ans,m_ans);


        while(true){
            if(temp_s * n_ans < n && temp_t * m_ans < m) {
                if (s.charAt(temp_s * m_ans) == t.charAt(temp_t * n_ans)) {

                }else {
//                    System.out.println(s.charAt(temp_s * n_ans) + ":" + temp_s * n_ans);
//                    System.out.println(t.charAt(temp_t * m_ans));
                    System.out.println(-1);

                }
                temp_s++;
                temp_t++;
            }else{
                System.out.println(l);
                return;
            }
        }


//        System.out.println(l + ":" + n_ans + ":" +m_ans + ":" +l_ans);
//        System.out.println(s);
//        System.out.println(t);



    }
    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }
}