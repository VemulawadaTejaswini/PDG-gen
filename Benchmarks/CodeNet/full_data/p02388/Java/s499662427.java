public class Main {

    public static void main(String[] args) {
        Optional<String> input = Optional.of(args[0]);
        long x = Integer.parseInt(input.orElse("0"));
        System.out.println(x * x * x);
    }
}