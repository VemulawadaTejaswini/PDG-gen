import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        List<Integer> R = new ArrayList<>();
        List<Integer> G = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            char  c = S.charAt(i);
            if(c=='R'){
                R.add(i);
            }else if (c=='G'){
                G.add(i);
            }else{
                B.add(i);
            }
        }


        int ans = 0;
        for (int i :R) {
            for (int j :G) {
                for (int k :B) {
                    int[] aa= new int[3];
                    aa[0]=i;
                    aa[1]=j;
                    aa[2]=k;
                    Arrays.sort(aa);
                   if(aa[1]-aa[0] != aa[2]-aa[1])
                    ans ++;
                }
            }
        }
        System.out.println(ans);
    }

    static int gcd(int a, int b ){
        if (a == 0)
            return b;

        return gcd(b%a, a);
    }

}
