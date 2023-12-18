import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int jud = true;
        for(int i = 0;i < 3;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                jud = false;
            }
        }

        if(jud == true){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}