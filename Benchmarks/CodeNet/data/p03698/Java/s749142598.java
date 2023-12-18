import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] moji = s.toCharArray();
        Arrays.sort(moji);
        int cnt  = 0;

        for(int i = 0;i<moji.length-1;i++){
            if(moji[i]==moji[i+1]){
                cnt++;
            }
        }
        if(cnt==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}


