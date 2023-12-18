import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String[] arr = n.split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a2 = Integer.parseInt(arr[1]);
        int absNumber1 = Math.abs(a1);
        int absNumber2 = Math.abs(a2);
        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);
        int lcm  = absHigherNumber;
        while (lcm % absLowerNumber != 0){
            lcm += absHigherNumber;
        }
        System.out.println(lcm);

    }
}
