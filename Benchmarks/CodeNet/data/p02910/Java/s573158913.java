import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        String a = "LR";

        for(int i=0; i<l; i++){
            if(i%2==0){
                if(S.charAt(i)==a.charAt(0)){
                    System.out.println("No");
                    break;
                }
            }
            else{
                if(S.charAt(i)==a.charAt(1)){
                    System.out.println("No");
                    break;
                }
            }
            if(i==l-1){
                System.out.println("Yes");
            }
        }
    }
}