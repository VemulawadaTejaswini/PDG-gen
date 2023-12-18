import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(6);
        int month = Integer.parseCharacter(s);
        
        if(month > 4){
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}