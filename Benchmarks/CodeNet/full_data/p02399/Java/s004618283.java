import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a/b+" "+a%b+" "+String.format("%.8f",1.0*a/b));  //商 余り 浮動少数8桁
    }
}
