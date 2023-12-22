import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str[];
        str = new String[3];
        int num1, num2, Ans;
        Ans =0;
        for (int i=1;;i++)
        {
        str[0] = in.next();
        str[1] = in.next();
        str[2] = in.next();
        num1 = Integer.parseInt(str[0]);
        num2 = Integer.parseInt(str[2]);
        if (str[1].equals("?")){break;}
        else{
        if (str[1].equals("+")){Ans = num1+num2;}
        if (str[1].equals("-")){Ans = num1-num2;}
        if (str[1].equals("*")){Ans = num1*num2;}
        if (str[1].equals("/")){Ans = num1/num2;}
        System.out.println(Ans);}
        }
    }
    
}