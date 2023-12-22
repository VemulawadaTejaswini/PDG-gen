import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner am = new Scanner(System.in);
        int x =am.nextInt();
        int y =am.nextInt();
        int c=1;
        while(true){
        if(x>y){
            x=x%y;
            if(x==0){
                c=y;
                break;
            }
        }
        else{
            y=y%x;
            if(y==0){
                c=x;
                break;
            }
        }
        
    }

        /*for(int a=1;a<=x && a<=y;a++){
            if(x%a==0 && y%a==0)c=a;
        }
        */
        System.out.println(c);
      am.close();  
    }
}
