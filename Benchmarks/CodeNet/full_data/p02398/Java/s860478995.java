import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = 0;
        for(int x = a; x <= b; x++){
          if(c % x <= 0){
          i = i + 1;
          }
        }
        System.out.println(i);
}

}
