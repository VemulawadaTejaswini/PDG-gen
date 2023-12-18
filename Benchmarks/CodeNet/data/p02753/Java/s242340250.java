public class Main { //クラス名はMain
    public static void main(String[] args) {
        boolean yORn = false;
        String answer = "No";

        if (args.toString().contains("A")) {
            if (args.toString().contains("B")) {
                yORn = true;
            }
        }
        if (yORn) {
            answer = "Yes";
        }

        System.out.print(answer);
    }
}