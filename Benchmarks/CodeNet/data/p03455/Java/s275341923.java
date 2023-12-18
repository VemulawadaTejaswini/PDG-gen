public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    String result = (a * b) % 2 == 0 ? "Even" : "Odd";
    System.out.println(result);
}