import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h1=sc.nextInt();
        int  s1=sc.nextInt();


        int h2=sc.nextInt();
        int s2=sc.nextInt();

        String win="No";
        while((h1>=0)||(h2>=0)){
            h2=h2-s1;
            h1=h1-s2;
            if(h1>0)
                win="Yes";
        }
        System.out.println(win);




    }
}



