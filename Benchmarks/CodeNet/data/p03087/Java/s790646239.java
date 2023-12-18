import java.util.*;


public class Main {

    private static final int INF = 1000000007;
    private static final int INF1 = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();

        int[] array = new int[str.length()];

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == 'C' && str.charAt(i-1) == 'A'){
                array[i] = array[i-1] + 1;
            }else{
                array[i] = array[i-1];
            }
        }

        for(int i=0; i<q; i++){
            int l = sc.nextInt();
            --l;
            int r = sc.nextInt();
            --r;
            System.out.println(array[r] - array[l]);
        }

    }
}
