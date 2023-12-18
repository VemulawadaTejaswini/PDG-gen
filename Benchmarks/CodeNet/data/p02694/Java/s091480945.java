import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 100;
        int k = 0;
        while(i < x){
            i = (int)(i * 1.01);
            k++;
        }
        System.out.println(k);
        sc.close();
    }
}