class Main{
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int area = a * b;
        int length = 2 * (a+b);
        System.out.println(String.format(
            "%d %d", area, length));
    }
}