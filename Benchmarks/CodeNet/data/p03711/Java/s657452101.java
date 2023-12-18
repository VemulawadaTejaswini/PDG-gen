import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        if(x==2){
            if(y!=2){
                System.out.println("No");
            }
            else if(y==2){ 
                System.out.println("Yes");
            }
        }
        else if(x==4||x==6||x==9||x==11){
            if(y==4||y==6||y==9||y==11){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else if(x==1||x==3||x==5||x==7||x==8||x==10||x==12){
            if(y==4||y==6||y==9||y==11||y==2){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}