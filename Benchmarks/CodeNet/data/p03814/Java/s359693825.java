import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        int cnt = 0;

        for(int i = 0;i<s.length()-1;i++){
            for(int j = i+1;j<s.length();j++){
                if(s.charAt(i)=='A' && s.charAt(j)=='Z'){
                    cnt=j-i+1;
                    if(max<cnt){
                        max=cnt;
                    }

                }
            }
            if(s.length()-(i+max)<max){
                break;
            }
        }
        System.out.println(max);
    }
}




