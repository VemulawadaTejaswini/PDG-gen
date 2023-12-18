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
                    if ( (i<j && j <k) ||(i>j && j >k)) {
                        if(i+k != 2 *j){
                             ans++;
                        }
                    }else if( (i <k &&  k <j) ||  (i >k &&  k >j)){
                        if(i+j != 2 *k){
                            ans++;
                        }
                    }else if( (j < i &&  i <k) ||  (j >i &&  i >k)){
                        if(j+k != 2 *i){
                            ans++;
                        }

                    }
                }
            }
        }
        System.out.println(ans);
    }

}
