
public class Main {

    public static void main(String[] args) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
            System.out.print(num * num * num);
        } catch (NumberFormatException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}