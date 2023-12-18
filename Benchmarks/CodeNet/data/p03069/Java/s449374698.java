import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        String stone = kbd.next();
        String[] s = stone.split("");
        List<String> ston = Arrays.asList(s);
        List<String> stones = new ArrayList<>(ston);
        int coun = 0;
        for (int i = n-1; i > 0;i--) {
            if (stones.get(i).equals(".")&&stones.subList(0, i).contains("#")) {
                coun++;
            }else if(stones.get(i).equals(".")&& !stones.subList(0, i).contains("#")){
                break;
            } 
        }
        System.out.println(coun);
    }
}