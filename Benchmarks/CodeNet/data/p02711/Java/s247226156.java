import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean isTrue=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='7'){
                isTrue=true;
                break;
            }
        }

        if(isTrue)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
