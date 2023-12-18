import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean jud = true;
        for(int i = 0;i < s.length();i++){
            for(int j = i+1;j < s.length();j++){
                if((s.indexOf(s.charAt(i))) == (s.indexOf(s.charAt(j)))){
                    jud = false;
                    break;
                }
            }
        }

        if(jud == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}