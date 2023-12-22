public class Main {
    public static void main(String[] args){
        Scanner stdIn= new Scanner(System.in);

        System.out.println("aの値 : "); int a =stdIn.nextInt();
        System.out.println("bの値 : "); int b =stdIn.nextInt();

        int X= a*b;
        int y=2*(a+b);
        System.out.println("面積は"+X+"です");
        System.out.println("周の長さはは"+y+"です");
    }

}
