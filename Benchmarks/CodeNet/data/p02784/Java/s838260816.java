import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int n = scan.nextInt();
        int maxAttack = 0;

        for(int i = 0;i < n;i++){
            maxAttack += scan.nextInt();
        }
        scan.close();

        if(h <= maxAttack) System.out.println("Yes");
        else System.out.println("No");
    }
}