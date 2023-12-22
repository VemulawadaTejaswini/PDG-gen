import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if('a'<=c&&c<='z')System.out.print(Character.toUpperCase(c));
            else if('A'<=c&&c<='Z')System.out.print(Character.toLowerCase(c));
            else System.out.print(c);
        }
        System.out.println();
    }
}