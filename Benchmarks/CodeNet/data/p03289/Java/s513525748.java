import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String s = S.substring(2,S.length()-1);
        int count = 0;
        int memo = 0;
        boolean judge = false;

        if(S.charAt(0) == 'A'){
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) == 'C'){
                    count++;
                    memo = i+2;
                }
            }
            if(count == 1){
                for(int i = 1;i < S.length();i++){
                    if(i == memo){
                        continue;
                    }else if(Character.isLowerCase(S.charAt(i))){
                        judge = true;
                    }else{
                        judge = false;
                    }
                    
                }
            }
        }
        if(judge == true){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
    }
}