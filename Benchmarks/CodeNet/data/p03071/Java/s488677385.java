import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int count=0;
        if(x>=y){
            count=x;
            x--;
        }
        else{
            count =y;
            y--;
        }
        if(x>=y){
            count+=x;
        }
        else{
            count+=y;
        }
        System.out.println(count);
    }
}
