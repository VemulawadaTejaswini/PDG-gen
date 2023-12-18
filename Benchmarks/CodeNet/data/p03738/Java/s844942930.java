import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int choice = 2;
        if(a.length() != b.length()){
            if(a.length() > b.length()){
                choice = 1;
            } else {
                choice = 3;
            }
        } else {
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) != b.charAt(i)){
                    if(a.charAt(i) > b.charAt(i)){
                        choice = 1;
                        break;
                    } else {
                        choice = 3;
                        break;
                    }
                }
            }
        }
        if(choice == 1){
            System.out.print("GREATER");
        } else if(choice == 3){
            System.out.print("LESS");
        } else {
            System.out.print("EQUAL");
        }
    }
}