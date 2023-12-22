import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(sc.nextLine());
        while(true){
            String s = sc.nextLine();
            if(s.equals("END_OF_TEXT")) break;
            sb.append(s);
        }
        String str = sb.toString().toLowerCase();
        int cnt = 0;
        while(str.contains(w)){
            ++cnt;
            str = str.replaceFirst(w," ");
        }
        System.out.println(cnt);
    }

}