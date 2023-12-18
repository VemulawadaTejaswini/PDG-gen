import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
      	sc.nextLine();
        String n = sc.nextLine();
        System.out.println(encrypt(n,i));
        sc.close();
    }
    static char[][] RANGE = {{'a', 'z'}, {'A', 'Z'}};
    static char slide(char c, int key){
        int ret = c + key;
        for(char[] t : RANGE) {
            if(c >= t[0] && c <= t[1]) {
                if(ret < t[0]) ret = t[1] - (t[0] - ret);
                if(ret > t[1]) ret = ret - t[1] + t[0]-1;
                return (char)ret;
            }
        }
        return c;
    }
    static String encrypt(String str, int key){
        StringBuilder sb = new StringBuilder();
        str.chars().forEach(c -> sb.append(slide((char)c, key)));
        return sb.toString();
    }
}