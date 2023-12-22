import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x!=0){
            System.out.println("Case " + i +": " + x);
            sc = new Scanner(System.in);
            x = sc.nextInt();
            i++;
        }
    }
}
