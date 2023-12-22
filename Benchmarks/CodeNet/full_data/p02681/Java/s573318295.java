import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        String ans = "yes";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                ans = "no";
                break;
            }
        }
        System.out.println(ans);
    }
}