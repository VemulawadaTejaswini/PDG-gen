import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()==2){
            System.out.println(s);
        } else{
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            System.out.println(sb.reverse().toString());
        }
    }
}
