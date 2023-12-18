public class Main {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        int answer = Math.max(0, a - b * 2);

        System.out.println(answer);
    }

}
