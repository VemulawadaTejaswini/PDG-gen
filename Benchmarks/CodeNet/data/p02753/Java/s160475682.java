import java.util.*;

class Main{
    Main(){
        Scanner SC = new Scanner(System.in);

        String S = SC.next();

        boolean A=false, B=false;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'A'){
                A = true;
            } else {
                B = true;
            }
        }

        if(A && B){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
