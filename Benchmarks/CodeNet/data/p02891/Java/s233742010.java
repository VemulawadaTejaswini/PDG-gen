import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int K = sc.nextInt();

        int L = S.length();
        char[] Si = S.toCharArray();
        int count = 0;
        int count2 = 0;
        char x = Si[0];

        for(int i = 0; i < L-1; i++){
            if(i == 0){
                if(x == Si[1]){
                    count++;
                    count2++;
            }
        }else{
            if(Si[i] == Si[i+1]){
                if(Si[i-1] == Si[i]){
                    if(count2 % 2 == 1){
                    count++;
                    count2++;
        }else{
            count2++;
        }
    }else{
        x = Si[i];
        count++;
        count2 = 0;
    }}else{
        x = Si[i];
        count2 = 0;
    }
}
        }
    if(Si[0] != Si[L-1]) count = count * K;
    else count = count * K + K-1;


System.out.print(count);

    }
}


    