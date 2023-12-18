import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String  S = sc.next();
        String s = S.substring(2,S.length()-1);
        int cnt = 0;
        int tmp = 0;

        boolean jud = false;

        if(S.charAt(0) == 'A'){
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == 'C'){
                    cnt++;
                    tmp = i;
                }
            }
            if(cnt == 1)
            for(int i = 0;i < S.length();i++){
                if(i == 0 || i == tmp){
                    continue;
                }else if(Character.isUpperCase(S.charAt(i))){
                       
                }else if(Character.isLowerCase(S.charAt(i))){
                    jud = true;
                }
        }
        

        if(jud == true){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }

        
        }
    }
}