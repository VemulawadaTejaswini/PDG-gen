import java.util.Scanner;

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int score=0;
        a=sc.nextInt();
        String s=String.valueOf(a);
        if(s.endsWith("2")||s.endsWith("4")||s.endsWith("5")||s.endsWith("7")||s.endsWith("9")){
            System.out.print("hon");
        }



        if(s.endsWith("0")||s.endsWith("1")||s.endsWith("6")||s.endsWith("8")){
            System.out.print("pon");
        }
        if(s.endsWith("3")){
            System.out.print("bon");
        }





    }

}



