import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int Q = sc.nextInt();
        StringBuilder sb = new StringBuilder(Q);
        sb.append(S);
        boolean flipped = false;
        for(int i=0; i<Q; i++) {
            String cmd = sc.next();
            if(cmd.equals("1")) {
                // filp
                flipped = !flipped;
            } else {
                String cmd2 = sc.next();
                String cmd3 = sc.next();
                // add
                switch(cmd2) {
                    case "1":
                        // add head
                        if(!flipped) {
                            sb.insert(0, cmd3);
                        } else {
                            sb.append(cmd3);
                        }
                        break;
                    case "2":
                        // add tail
                        if(!flipped) {
                            sb.append(cmd3);
                        } else {
                            sb.insert(0, cmd3);
                        }
                        break;
                }
            }
        }
        if(!flipped) {
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.reverse().toString());
        }
    }
}