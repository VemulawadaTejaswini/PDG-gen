import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = Integer.parseInt(a.substring(0, 2));
        int d = Integer.parseInt(a.substring(2, 4));
        System.out.println(c+" "+d);
        if(c>12&&c!=00&&d<12&&d!=00){
            System.out.println("YYMM");
        }else if(c<12&&c!=00&&d>12&&d!=00){
            System.out.println("MMYY");
        }else if(c<=12&&c!=00&&d<=12&&d!=00){
            System.out.println("AMBIGUOUS");
        }else{
            System.out.println("NA");
        }
    }

}