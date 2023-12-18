import java.util.Scanner;
public final class Caesar {
    public static final void main(String[] d) {
        final String dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String target = new Scanner(System.in).next();
        final StringBuilder ret = new StringBuilder(target.length);
        final int offset = 3;
        for (int i = 0; i < target.length; i++) {
            ret.append(dic.charAt((target.charAt(i) - 65 + offset) % 26));
        }
        System.out.println(ret);
    }
}