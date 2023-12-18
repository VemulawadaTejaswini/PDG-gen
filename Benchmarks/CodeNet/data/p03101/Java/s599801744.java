import java.util.Scanner;

class A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Hight = sc.nextInt();
        int Width = sc.nextInt();
        int row = sc.nextInt();
        int column = sc.nextInt();
        int ans = Hight * Width;
        ans -= row * Width;
        ans -= ((Hight - row) * column);
        System.out.println(ans);
        sc.close();
    }
}
