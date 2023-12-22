import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    //int r = 0;
    sc.close();

    if(d / s <= t){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }

}
}