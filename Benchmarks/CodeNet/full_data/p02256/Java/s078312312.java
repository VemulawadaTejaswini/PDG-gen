import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner am = new Scanner(System.in);
        int x =am.nextInt();
        int y =am.nextInt();
        int c=1;
        for(int a=1;a<=x && a<=y;a++){
            if(x%a==0 && y%a==0)c=a;
        }
        System.out.println(c);
      am.close();  
    }
}
