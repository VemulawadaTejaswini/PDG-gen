import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean jdg = true;;
        for(int i = 0;i < S.length();i++){
            if(i % 2 == 0){
                if(S.charAt(i) == 'L'){
                    jdg = false;
                    break;
                }
            }else{
                if(S.charAt(i) == 'R'){
                    jdg = false;
                    break;
                }
            }
        }
        System.out.println(jdg == true?"Yes":"No");
    }
}