
import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //台形の面積を求める
        int a = sc.nextInt(); //ペンキa
        int b = sc.nextInt(); //ペンキb
        int c = sc.nextInt(); //ペンキc
        
        if(a == b && b == c){
            System.out.println(1);
        }
        else if(a != b && b !=c){
            System.out.println(3);
        }
        else{
            System.out.println(2);
        }
    }     
}
