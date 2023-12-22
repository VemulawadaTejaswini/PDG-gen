import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String x=in.nextLine();
        int sum=0;
        for (int j=0;j+4<x.length();j++) {
            for (int i = j+4; i < x.length(); i++) {
                long y = Long.parseLong(x.substring(j,i+1));
                if (y % 2019 == 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}