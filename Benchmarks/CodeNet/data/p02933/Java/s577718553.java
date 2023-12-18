import java.util.Scanner;

public class Main  {
    private static Scanner sc= new Scanner(System.in);
    public static void main(String[] s) {
        int a=sc.nextInt();
        sc.nextLine();
        String b=new String(sc.nextLine());
        if(a<3200){
            System.out.print("red");
        }
        else{
            System.out.print(b);
        }
    }}