import java.util.Scanner;
class Main{
    public void yatary() {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        x = sc.nextInt();
        y = sc.nextInt();
        int z = x *y;
     System.out.println(z);   
    }
    public static void main(String[] args){
    new Main().yatary();
    }
}