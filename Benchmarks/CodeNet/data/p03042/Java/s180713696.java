import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int abcd = sc.nextInt();
        int a = abcd / 1000;
        int b = (abcd - a * 1000) / 100;
        int c = (abcd - a * 1000 - b * 100)/10;
        int d = abcd - a * 1000 - b * 100 - c * 10;
        int ab = a * 10 + b ;
        int cd = c * 10 + d;

        if (0 < ab & ab <13){
          if (0 < cd & cd <13){
            System.out.println("AMBIGUOUS");
          }else{
            System.out.println("MMYY");
          }
        } else{
          if (0 < cd & cd <13){
            System.out.println("YYMM");
        }else{
          System.out.println("NA");
        }


    }
}
}
