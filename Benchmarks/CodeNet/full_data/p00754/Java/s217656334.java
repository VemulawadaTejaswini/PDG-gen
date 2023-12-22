import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.nextLine();
            if(s.equals(".")) break;

            s = s.replaceAll("[A-Za-z \\.]", "");

            while(true){
                String before = s;
                String after = s.replaceAll("\\[\\]", "");
                after = after.replaceAll("\\(\\)", "");

                if(before.length() == after.length()){
                    break;
                }

                s = after;
            }

            if(s.length() != 0){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}