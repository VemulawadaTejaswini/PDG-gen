public class Main {

    public static void main(String[] args) {

        if (args.length < 2) {
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int answer = Math.max(0, a - b * 2);

        System.out.println(answer);
    }

}
