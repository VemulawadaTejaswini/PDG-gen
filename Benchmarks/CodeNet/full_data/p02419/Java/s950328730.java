import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine();
        String t = scan.nextLine();
        String add = scan.nextLine();
        int sum = 0;
        while (!add.equals("END_OF_TEXT")){
            t = t + " " + add;
            add = scan.nextLine();
        }
        t = t.replaceAll(w, "@");
        for(int x = 0; x < t.length(); x++){
            if('@' == t.charAt(x)){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
