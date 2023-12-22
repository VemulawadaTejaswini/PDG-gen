import java.util.Scanner;

public class Mamin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         String S = sc.nextLine();
         String x = "";

        if(charAt(S.length()-1) != "s")){
            String x = S.append("s");
        }else{
             String x = S.append("es");
        }
        System.out.print(x);
    }
}

