import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char a = str.charAt(i);
            if(Character.isUpperCase(a)){
                ans+=String.valueOf(Character.toLowerCase(a));
            }else{
                ans+=String.valueOf(Character.toUpperCase(a));
            }
        }
        System.out.println(ans);
    }
}