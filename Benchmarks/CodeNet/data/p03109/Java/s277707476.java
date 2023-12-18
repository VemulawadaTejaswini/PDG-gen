import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String [] S1 = S.split("/",0);
        int year,month,day;
         year = Integer.parseInt(S1[0]);
         month = Integer.parseInt(S1[1]);
         day = Integer.parseInt(S1[2]);
        if(year>=2019&&month>=5&&day>=1) System.out.println("TBD");
        else System.out.println("heisei");

    }
}