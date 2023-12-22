import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==-1&&b==-1&&c==-1) break;
            String s;
            if(a==-1||b==-1) s="F";
            else if(a+b>=80) s="A";
            else if(a+b>=65) s="B";
            else if(a+b>=50) s="C";
            else if(a+b>=30){
                if(c>=50) s="C";
                else s="D";
            }else s="F";
            System.out.println(s);
        }
    }
}
