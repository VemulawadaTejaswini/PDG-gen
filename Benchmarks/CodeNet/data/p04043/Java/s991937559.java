import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a ,b,c;
        Scanner input =  new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        if(a+b+c==17){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}