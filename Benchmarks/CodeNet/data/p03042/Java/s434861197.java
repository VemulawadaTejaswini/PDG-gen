import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int x = s / 100;
        int y = s % 100;
        if(x<=12&&y<=12){
            System.out.println("AMBIGIUOUS");
        }else if(x<=12&&x!=0){
            System.out.println("MMYY");
        }else if(y<=12&&y!=0){
            System.out.println("YYMM");
        }else {
            System.out.println("NA");
        }
    }
}
