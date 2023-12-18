import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int l=sc.nextInt();
        int n=Math.min(a, b);
        int q=Math.max(a, b);
        if(n<=l&&l<=q)System.out.println("Yes");
        else System.out.println("No");
    }
}
