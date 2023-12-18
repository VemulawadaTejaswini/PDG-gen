import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        str = str + str;


        if(str.contains(sc.nextLine()))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}