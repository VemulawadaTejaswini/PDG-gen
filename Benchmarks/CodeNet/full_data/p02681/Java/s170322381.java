import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
String S= scan.next();

        String T= scan.next();

String TT=T.substring(0,S.length());

if(TT.equals(S)     ){System.out.println("Yes");}
else{System.out.println("No");}

}

       }