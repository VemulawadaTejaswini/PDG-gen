import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sBeforeLength = s.length();
        String p = sc.next();
        s = s + s.substring(0, p.length()-1);
        int flag = 1;
        for(int i=0; i<=sBeforeLength-1; i++){
            if( p.equals( s.substring( i, i+p.length() ) ) ) flag=0;
        }
        if(flag==0) {System.out.println("Yes");}
        else{System.out.println("No");}
    }
}
