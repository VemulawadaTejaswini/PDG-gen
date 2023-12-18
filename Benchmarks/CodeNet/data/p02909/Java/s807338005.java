import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String res = "";
        if(a.equals("Sunny")){
            res = "Cloudy";
        }
        else if(a.equals("Cloudy")){
            res = "Rainy";
        }
        else{
            res = "Sunny";
        }
        System.out.println(res);

    }
}