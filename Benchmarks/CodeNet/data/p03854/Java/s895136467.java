import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(sc.nextLine());
        sb.reverse();
        do{
            if(sb.toString().length() >= 5 && sb.substring(0, 3).equals("mae")){
                sb.delete(0, 5);
            }else if(sb.toString().length() >= 7 && sb.substring(0, 3).equals("rem")){
                sb.delete(0, 7);
            }else if(sb.toString().length() >= 5 && sb.substring(0, 3).equals("esa")){
                sb.delete(0, 5);
            }else if(sb.toString().length() >= 6 && sb.substring(0, 3).equals("res")){
                sb.delete(0, 6);
            }else{
                System.out.println("NO");
                return;
            }
        }while(sb.toString().length() > 0);
        System.out.println("YES");
    }
}