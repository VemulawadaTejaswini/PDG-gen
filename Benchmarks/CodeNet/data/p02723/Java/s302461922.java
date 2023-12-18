import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String N = scan.next();
        String M[]=new String [6];

        for(int i=0;i<6;i++)
        { M[i]=N.substring(i,i);}
        if(M[2].equals(M[3])&&M[4].equals(M[5])){System.out.println("Yes");}
       else{System.out.println("No");}
//入力完了