import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean flag = true;
        while(S.length()>0){
            int len = S.length();
            if(len<5){
                flag=false;
                break;
            }
            if(S.charAt(len-1)=='m'){
                flag = S.substring(len-5,len).equals("dream");
                S = S.substring(0,len-5);
            }
            else if(S.charAt(len-1)=='e'){
                flag = S.substring(len-5,len).equals("erase");
                S = S.substring(0,len-5);
            }
            else if(S.charAt(len-1)=='r'&&S.charAt(len-3)=='s'){
                if(S.length()<6) flag = false;
                else{
                    flag = S.substring(len-6,len).equals("eraser");
                    S = S.substring(0,len-6);
                }
            }
            else if(S.charAt(len-1)=='r'&&S.charAt(len-3)=='m'){
                if(S.length()<7) flag = false;
                else{
                    flag = S.substring(len-7,len).equals("dreamer");
                    S = S.substring(0,len-7);
                }
            }
            else{
                flag = false;
            }
            if(!flag) break;
        }
        String ans = (flag==true)?"YES":"NO";
        System.out.println(ans);
    }
}
