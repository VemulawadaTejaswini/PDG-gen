import java.util.*;

public class Main{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if(S == "abc"){
            System.out.println("Yes");
        }else if(S == "bac"){
            System.out.println("Yes");
        }else if(S == "bca"){
            System.out.println("Yes");
        }else if(S == "cba"){
            System.out.println("Yes");
        }else if(S == "acb"){
            System.out.println("Yes");
        }else if(S == "cab"){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}