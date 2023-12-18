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

        l = getLCM(n,m,getGCD(n,m));

        int n_ans;
        int m_ans;

        n_ans = l / n;
        m_ans = l / m;

        int l_ans;

        int temp_s = 0;
        int temp_t = 0;

        String s_a="";
        String t_a="";

        l_ans = getLCM(n_ans,m_ans,getGCD(n_ans,m_ans));


//        while(true){
//            if((temp_s * m_ans < n )&&(temp_t * n_ans < m)) {
//                if (s.charAt(temp_s * m_ans) == t.charAt(temp_t * n_ans)) {
//
//                }else {
//                    System.out.println(-1);
//                    return;
//
//                }
//                temp_s++;
//                temp_t++;
//            }else{
//                System.out.println(l);
//                return;
//            }
//        }

        for(int i = 0;i < n;i++){
            if(i % m_ans == 0){
                s_a =  s_a + s.charAt(i);

            }
        }


        for(int i = 0;i < m;i++){
            if(i % n_ans == 0){
                t_a =  t_a + t.charAt(i);

            }
        }

        if(s_a.equals(t_a)){
            System.out.println(l);
        }else{
            System.out.println("-1");
        }


    }
//    static int lcm (int a, int b) {
//        int temp;
//        long c = a;
//        c *= b;
//        while((temp = a%b)!=0) {
//            a = b;
//            b = temp;
//        }
//        return (int)(c/b);
//    }
private static int getGCD(int m, int n) {
    return n == 0 ? m : getGCD(n, m % n);
}

    private static int getLCM(int m, int n, int gcd) {
        return m * n / gcd;
    }
}