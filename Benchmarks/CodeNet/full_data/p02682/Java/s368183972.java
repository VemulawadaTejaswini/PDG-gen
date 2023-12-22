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
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();


        if(a+b>d){
            score=d-b;
        }else{

            score= 1*a+0*b;

            int x=d-a-b;
            score-=(x*1);


        }

        System.out.print(score);



    }

}
