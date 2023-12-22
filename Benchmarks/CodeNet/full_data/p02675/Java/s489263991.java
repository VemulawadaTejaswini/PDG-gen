import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int N = sn.nextInt();
        int amari = N % 10;
        String unit = "";

        switch (amari) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                unit = "hon";
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                unit = "pon";
                break;
            case 3:
            unit = "bon";
            break;
        }

        System.out.println(unit);
    }
}