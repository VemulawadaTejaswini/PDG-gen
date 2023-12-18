import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String ans = "AC";
        if(s[0]!='A'){
            ans = "WA";
        }
        if(s[1]=='C'){
            ans = "WA";
        }
        int j = 0;
        for(int i =3;i<s.length;i++){
            if(Character.isUpperCase(s[i])){
                if(s[i]!='C'||i==j||i==s.length-1){
                    ans = "WA";
                } else {
                    j = i;
                }
            }
        }
        if(j==0){
            ans ="WA";
        }
        System.out.println(ans);
    }
}