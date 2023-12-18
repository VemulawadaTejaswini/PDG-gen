import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int la = A.length();
        int lb = B.length();

        if(la>lb){
            System.out.println("GREATER");
        }
        else if(la<lb){
            System.out.println("LESS");
        }
        else if(la==lb){
            if(A.equals(B)){
                System.out.println("EQUAL");
            }
            else{
                for(int i=0; i<la; i++){
                    if(A.charAt(i)>B.charAt(i)){
                        System.out.println("GREATER");
                        break;
                    }
                    if(A.charAt(i)<B.charAt(i)){
                        System.out.println("LESS");
                        break;
                    }
                }
            }
        }
    }
}