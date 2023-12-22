import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String w = input.next().toUpperCase();
        int cnt = 0;

        while (true){
            String t = input.next().toUpperCase();//.replaceAll("[\".,]", "");

            if (t.equals("END_OF_TEXT")) break;
            if (w.equals(t)) cnt++;
        }
        System.out.println(cnt);
    }
}