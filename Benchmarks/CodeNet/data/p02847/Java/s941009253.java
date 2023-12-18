import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        int day = 0;
        if(str.equals("SUN")){
            day = 7;
        }else if (str.equals("MON")){
            day = 6;
        }else if (str.equals("TUE")){
            day = 5;
        }else if(str.equals("WED")){
            day = 4;
        } else if(str.equals("THU")){
            day = 3;
        } else if (str.equals("FRI")){
            day = 2;
        } else {
            day = 1;
        }
        System.out.println(day);
    }
}
