import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int age=scn.nextInt();
        if(age==1){
            System.out.println("Hello World");
        }else{
            int a=scn.nextInt();
            int b=scn.nextInt();
            System.out.println(a+b);
        }
    }
}