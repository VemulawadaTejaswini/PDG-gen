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
                int a = Integer.parseInt(A.substring(la - 1));
                int b = Integer.parseInt(B.substring(lb - 1));
                for(int i=la; i>0; i--){
                    if(a>b){
                        System.out.println("GREATER");
                        break;
                    }
                    else if(a<b){
                        System.out.println("LESS");
                        break;
                    }
                    a = Integer.parseInt(A.substring(i - 1, i));
                    b = Integer.parseInt(B.substring(i - 1, i));
                }
            }
        }
    }
}