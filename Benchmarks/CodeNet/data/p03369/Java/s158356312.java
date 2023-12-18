import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String s = sc.nextLine();
                if(s.equals("xxx")){
                    System.out.println(700);
                }else if(s.equals("xxo") || s.equals("xox") || s.equals("oxx")){
                    System.out.println(800);
                }else if(s.equals("xoo") || s.equals("oxo") || s.equals("oox")){
                    System.out.println(900);
                }else{
                    System.out.println(1000);
                }
            }
        }
    }
}