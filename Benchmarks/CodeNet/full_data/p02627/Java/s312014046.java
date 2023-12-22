//import java.util.ArrayList;
import java.util.*;
//import java.lang.*;
import java.util.regex.*;
public class CodeChef{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(Pattern.matches("[A-Z]", str)){
            System.out.print('A');
        }else{
            System.out.print('a');
        }
    }
}