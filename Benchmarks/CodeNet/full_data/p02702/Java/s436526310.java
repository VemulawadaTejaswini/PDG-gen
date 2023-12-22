import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] work = new char[S.length()];

        for(int i = 0; i < S.length(); i++){
            work[i] = S.charAt(i);
        }
        String sum = "";
        int ans = 0;
        for (int j=0; j < work.length; j++){
            for(int k = j + 1; k < work.length; k++){
                sum = String.valueOf(work[j]) + String.valueOf(work[k]);
                if(Integer.parseInt(sum)%2019 == 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}