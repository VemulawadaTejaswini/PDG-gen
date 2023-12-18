import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s/100<=12 && s%100<=12 && s/100>0 && s%100>0)
            System.out.println("AMBIGUOUS");
        else if(s/100<=12 && s/100>0)
            System.out.println("MMYY");
        else if(s%100<=12 && s%100>0)
            System.out.println("YYMM");
        else
            System.out.println("NA");
    }
}
