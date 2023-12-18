import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = sc.next();

        int ans = 0;


        for (int i=0; i<=999; i++){
            String str = String.valueOf(i);
            if (str.length()==1){
                str = "00" + str;
            }else if (str.length()==2){
                str = "0" + str;
            }
            char[] c = str.toCharArray();
            char[] number = s.toCharArray();

            int tmp = 0;

            int tmp_k = 0;

            for (int j=0; j<c.length; j++){
                for (int k=0; k<number.length; k++){
                    if (c[j]==number[k]){
                        ++tmp;
                        j++;
                        if (j>=3)break;
                    }
//                    if (tmp==3) break;
                }
            }
            if (tmp==3){
                ans++;
            }
        }
        System.out.println(ans);

    }
}