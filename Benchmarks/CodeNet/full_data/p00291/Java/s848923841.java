import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt()+sc.nextInt()*5+sc.nextInt()*10+sc.nextInt()*50
                +sc.nextInt()*100+sc.nextInt()*500)>=1000?1:0);
    }
}
