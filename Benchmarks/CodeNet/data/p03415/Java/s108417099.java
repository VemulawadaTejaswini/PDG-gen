import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        for(int i=0;i<3;i++){
            String x=scn.next();
            System.out.print(x.charAt(i));
        } 
        System.out.println();
    }
}