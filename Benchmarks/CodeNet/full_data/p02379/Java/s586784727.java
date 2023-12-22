import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        double x1, x2, y1, y2;
        str = scan.nextLine();
        String[] num = str.split(" ", 0);
        x1 = Double.valueOf(num[0]);
        y1 = Double.valueOf(num[1]);
        x2 = Double.valueOf(num[2]);
        y2 = Double.valueOf(num[3]);
        System.out.println(Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2)));


        scan.close();

    }

}

