import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int sum = a + b, c = a - b, d = a * b;
        int max = sum;
        if(sum < c){
            if(c < d){
                sum = d;
            } else{
                sum = c;
            }
        } else if(sum < d){
            max = d;
        }
        System.out.println(max);
    }
}