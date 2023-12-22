import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] work = S.split("");
        String sum = "";
        int ans = 0;
        for (int j=0; j < work.length; j++){
            sum = work[j];
            for(int k = j + 1; k < work.length; k++){
                sum+= work[k];
                if(Double.parseDouble(sum)%2019 == 0){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}