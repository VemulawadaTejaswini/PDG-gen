import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        double c=Math.sqrt(Integer.parseInt(a+b));
        if(c==(int)c){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}