import java.io.*;
import java.util.*;

public class Main {
    BufferedReader br;
    Main() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public static void main(String[] args) {
        new Main().run();
    }
    ArrayList<StringBuilder> buf;
    ArrayList<String> cmds;
    String clipboard;
    boolean init() {
        String s;
        clipboard = new String();
        buf = new ArrayList<StringBuilder>();
        cmds = new ArrayList<String>();
        try {
            while (!(s = br.readLine()).equals("END_OF_TEXT")) {
                buf.add(new StringBuilder(s));
            }
            while (!(s = br.readLine()).equals("-")) {
                cmds.add(s);
            }
        } catch (IOException e) {}
        return true;
    }
    void run() {
        init();
        //for (StringBuilder b : buf) {
        //    System.out.println(b);
        //}
        int r = 0;
        int c = 0;
        for (String cmd : cmds) {
            //System.out.println("cmd: " + cmd);
            if (cmd.equals("a")) {
                c = 0;
            } else if (cmd.equals("e")) {
                c = buf.get(r).length();
            } else if (cmd.equals("p")) {
                if (r > 0) {
                    r--;
                    c = 0;
                } else {
                    c = 0;
                }
            } else if (cmd.equals("n")) {
                if (r < buf.size()-1) {
                    r++;
                    c = 0;
                } else {
                    c = 0;
                }
            } else if (cmd.equals("f")) {
                if (c != buf.get(r).length()) {
                    c++;
                } else if (r < buf.size()) {
                    r++;
                    c = 0;
                }
            } else if (cmd.equals("b")) {
                if (c != 0) {
                    c--;
                } else if (r > 0) {
                    r--;
                    c = buf.get(r).length();
                }
            } else if (cmd.equals("d")) {
                if (c != buf.get(r).length()) {
                    buf.get(r).deleteCharAt(c);
                } else if (r < buf.size()-1){
                    buf.get(r).append(buf.get(r+1));
                    buf.remove(r+1);
                }
            } else if (cmd.equals("k")) {
                if (c == buf.get(r).length()) {
                    buf.get(r).append(buf.get(r+1));
                    buf.remove(r+1);
                    clipboard = "\n";
                    //System.out.println("copied newline"); 
                } else {
                    clipboard = buf.get(r).substring(c);
                    buf.get(r).delete(c, buf.get(r).length());
                    c = buf.get(r).length();
                }
            } else if (cmd.equals("y")) {
                //System.out.println("r: " + r + " c: " + c);
                //System.out.println("clipboard: " + clipboard);
                if (!clipboard.isEmpty()) {
                    if (clipboard.equals("\n")) {
                        StringBuilder tmp = new StringBuilder(buf.get(r).substring(c));
                        buf.get(r).delete(c, buf.get(r).length());
                        buf.add(r, tmp);
                        r++;
                        c = 0;
                    } else {
                        buf.get(r).insert(c, clipboard);
                    }
                }
            }

            //System.out.println("------ current buffer ------");
            //System.out.println("r: " + r + " c: " + c);
            //for (StringBuilder b : buf) {
            //    System.out.println(b);
            //}
            //System.out.println("");
        }
        for (StringBuilder b : buf) {
            System.out.println(b);
        }
    }
}