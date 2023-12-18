import java.util.Scanner;

class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a%2==0||b%2==0){
            System.out.println("No");    
        }else
            System.out.println("Yes");
    }
}