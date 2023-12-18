import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] count = new int[N];
        String[] str = new String[N];
        int cnt = 0;
        int max = 0;
        
        for(int i=0; i<N; i++){
            String S = sc.next();
            if(Arrays.asList(str).contains(S)){
                for(int j=0; j<cnt; j++){
                    if(S.equals(str[j])){
                        count[j]++;
                        if(max < count[j]){
                            max = count[j];
                        }
                        break;
                    }
                }
            }else{
                str[cnt] = S;
                cnt++;
            }
        }
        String[] str2 = new String[cnt];
        int cnt2 = 0;
        for(int i=0; i<cnt; i++){
            if(count[i] == max){
                str2[cnt2] = str[i];
                cnt2++;
            }
        }
        String[] str3 = new String[cnt2];
        int cnt3 = 0;
        for(int i=0; i<cnt; i++){
            if(str2[i]!=null){
                str3[cnt3] = str2[i];
                cnt3++;
                //System.out.println(str2[i]);
            }
        }
        Arrays.sort(str3);
        for(int i=0; i<cnt2; i++){
            System.out.println(str3[i]);
        }
    }
}