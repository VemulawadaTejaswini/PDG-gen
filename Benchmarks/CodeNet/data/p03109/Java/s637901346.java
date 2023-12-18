import java.util.*;
public class Main {
    public static void main(String[] args){
        String[] cal;
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] difs = S.split("/");
        int dif0 = Integer.parseInt(difs[0]);
        int dif1 = Integer.parseInt(difs[1]);
        int dif2 = Integer.parseInt(difs[2]);
        if(dif0 <= 2019 && dif1 <= 4 && dif2 <= 30){
            System.out.print("Heisei");
        }else{
            System.out.print("TBD");
        }
    }
}