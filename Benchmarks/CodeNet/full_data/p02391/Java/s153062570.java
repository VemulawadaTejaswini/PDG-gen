import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner stdIn=new Scanner(System.in);
        int x=stdIn.nextInt();
        int y=stdIn.nextInt();
        if(x>y){
            System.out.println(x+">"+y);
        }
        else if(x<y){
            System.out.println(x+"<"+y);
        }
        else{
            System.out.println(x+"=="+y);
        }
    }
}

