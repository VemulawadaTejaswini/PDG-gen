import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int a=input.nextInt();
        int b=input.nextInt();
        if(b<a){
            System.out.print("delicious");
        }
        else{
            if((b-a)<=x){
                System.out.print("safe");
            }
            else{
                System.out.print("dangerous");
            }
        }
    }
}