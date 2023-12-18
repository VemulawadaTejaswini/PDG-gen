public class Main {
    public static void main(String[] args){
        double PI = 3.1415;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int input = Integer.parseInt(str);
        System.out.println(Math.PI*input*2);
    }
}