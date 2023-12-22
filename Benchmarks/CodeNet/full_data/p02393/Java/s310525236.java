import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x;
        while(a>b || b>c){
            if(a>b){
                x=a;
                a=b;
                b=x;
            }
            if(b>c){
                x=b;
                b=c;
                c=x;
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
