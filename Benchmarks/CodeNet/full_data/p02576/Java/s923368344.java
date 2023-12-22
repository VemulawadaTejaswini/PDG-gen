public class aaaa {
    public class Main {
        public static void main(String[] args) {
            int a = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            if(Integer.parseInt(args[0]) % Integer.parseInt(args[1]) > 0){
                a = a + 1;
            }

            System.out.println(a * Integer.parseInt(args[3]));
        }
    }
}
