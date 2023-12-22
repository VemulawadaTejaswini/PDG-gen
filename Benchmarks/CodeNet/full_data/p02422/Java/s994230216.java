import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            String cmd = scan.next();
            if(cmd.equals("print")){
                int l = scan.nextInt();
                int r = scan.nextInt();
                System.out.println(s.substring(l, r + 1));
            }
            if(cmd.equals("reverse")){
                int l = scan.nextInt();
                int r = scan.nextInt();
                String t = s;
                s = "";
                for(int j = 0; j < t.length(); j++){
                    if(l <= j && r >= j){
                        s += t.charAt(r - (j - l));
                    }
                    else s += t.charAt(j);
                }
            }
            if(cmd.equals("replace")){
                int l = scan.nextInt();
                int r = scan.nextInt();
                String p = scan.next();
                String t = s;
                s = "";
                for(int j = 0; j < t.length(); j++){
                    if(l <= j && r >= j){
                        s += p.charAt(j - l);
                    }
                    else s += t.charAt(j);
                }
            }
        }
    }
}

