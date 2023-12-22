import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b;
        for (int i=0 ;; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            sc.nextLine();
            if ((a == 0) && (b == 0)) break;
            if (a > b) {
                System.out.println(b+" "+a);
            }else{
                System.out.println(a+" "+b);
            }
        }
        sc.close();
    }
}
