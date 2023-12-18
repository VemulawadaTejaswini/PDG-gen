import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=N;
        int count=0;
        while(i!=0){
            i=i/2;
            count++;
        }
        System.out.println((count-1)*2);
    }
}