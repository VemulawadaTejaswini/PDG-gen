import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(execute(sc.nextLine()));

    }

    public static String execute(String input) {
        String[] charArray = input.split("");
        StringBuilder sb = new StringBuilder();
        for(String chara : charArray){
            if(sb.length() != 0 && chara.equals("B")){
                sb.deleteCharAt(sb.length() - 1);
            }
            else if(chara.equals("0") || chara.equals("1")){
                sb.append(chara);
            }
        }

        return sb.toString();
    }
}
