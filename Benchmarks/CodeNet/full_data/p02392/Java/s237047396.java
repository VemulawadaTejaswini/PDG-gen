import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            int c = sc.nextInt();
            if(b<c){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
