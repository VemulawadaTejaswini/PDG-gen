import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String sum = "";
        for (int i = 0; i < S.length(); i++) {
            sum += "x";
        }
        System.out.println(sum);
    }
}