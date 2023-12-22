public class Main {

    public static void main(String[] args) {

        int num = new java.util.Scanner(System.in).nextInt();
        int[] count = new int[4];
        for (int i = 0; i < num; i++) {
            String str = new java.util.Scanner(System.in).nextLine();
            switch (str) {
                case "AC":
                    count[0]++;
                    break;
                case "WA":
                    count[1]++;
                    break;
                case "TLE":
                    count[2]++;
                    break;
                case "RE":
                    count[3]++;
            }
        }

        System.out.println("AC x " + count[0]);
        System.out.println("WA x " + count[1]);
        System.out.println("TLE x " + count[2]);
        System.out.println("RE x " + count[3]);
    }

}
