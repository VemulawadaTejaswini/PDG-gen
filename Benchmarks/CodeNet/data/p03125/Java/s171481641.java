public class AandB {
        public static void main(String args[]) {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);

                if (b % a == 0) {
                        System.out.println(a+b);
                } else {
                        System.out.println(b-a);
                }
        }
}