public class Main {
    public static void main(String[] args) {
        int dist = Integer.parseInt(args[0]);
        int speed = Integer.parseInt(args[2]);
        int time = Integer.parseInt(args[1]);
        String ans = dist/speed < time ? "Yes" : "No";
        System.out.println(ans);
    }
}
