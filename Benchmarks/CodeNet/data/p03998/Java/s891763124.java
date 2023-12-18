import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sa = in.next();
        String sb = in.next();
        String sc = in.next();
        Deque<Character> a = new ArrayDeque<Character>();
        Deque<Character> b = new ArrayDeque<Character>();
        Deque<Character> c = new ArrayDeque<Character>();
        
        for (int i = 0; i < sa.length(); i++) {
            a.addLast(sa.charAt(i));
        }
        for (int i = 0; i < sb.length(); i++) {
            b.addLast(sb.charAt(i));
        }
        for (int i = 0; i < sc.length(); i++) {
            c.addLast(sc.charAt(i));
        }
        
        char turn = 'a';
        char winner = 'A';
        
        while(true){
            if(turn == 'a'){
                if(a.isEmpty()){
                    winner = 'A';
                    break;
                }
                else{
                    turn = a.removeFirst();
                }
            }
            else if(turn == 'b'){
                if(b.isEmpty()){
                    winner = 'B';
                    break;
                }
                else{
                    turn = b.removeFirst();
                }
            }
            else {
                if(c.isEmpty()){
                    winner = 'C';
                    break;
                }
                else{
                    turn = c.removeFirst();
                }
            }
            
        }
        System.out.println(winner);
    }
}
