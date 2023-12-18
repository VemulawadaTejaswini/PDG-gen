public class Main{
    public static void main(String[] args){
        int n = new java.util.Scanner (System.in).nextInt();
        int a = new java.util.Scanner (System.in).nextInt();
        int b = new java.util.Scanner (System.in).nextInt();
        int ans = n*a;
        if ( ans < b){
            System.out.println(ans);
        } else {
            System.out.println(b);
        }
    }
}
