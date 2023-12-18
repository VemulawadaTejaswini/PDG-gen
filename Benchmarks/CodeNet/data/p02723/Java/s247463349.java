import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        String ans=cin.next();
        if(ans.charAt(2)==ans.charAt(3)&&ans.charAt(4)==ans.charAt(5)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
