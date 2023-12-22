import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x,y;
    int small,big,a;
    x = scan.nextInt();
    y = scan.nextInt();
    scan.close();
    if(x < y) {
        small = x;
        big = y;
    }
    else {
        big =x;
        small = y;
    }
    while(true){
        a = big%small;
        big = small;
        small = a;
        if(a==0)break;
    }
    System.out.println(big);
    }
}
