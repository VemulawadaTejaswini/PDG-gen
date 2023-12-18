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
                    if(i != memo){
                        if(Character.isUpperCase(S.charAt(i))){
                            judge = false;
                            break;
                        }else{
                            judge = true;
                        }
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