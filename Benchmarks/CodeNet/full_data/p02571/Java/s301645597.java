import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.nextLine();
        String t = stdIn.nextLine();
        int c = 0;
        int x = t.length();
        for(int i = 0 ; i < (s.length() - t.length()) + 1 ; i++){
            for(int j = 0 ; j < t.length() ; j++){
                if(t.charAt(j) != s.charAt(i + j)){
                    c += 1;
                }
            }
            if(x > c){
                x = c;
            }
            c = 0;
        }
        System.out.println(x);
    }
}
