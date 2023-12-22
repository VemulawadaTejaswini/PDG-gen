import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inputArr[] = input.split(" ");
        
        double x0 = Double.parseDouble(inputArr[0]);
        double y0 = Double.parseDouble(inputArr[1]);
        double x1 = Double.parseDouble(inputArr[2]);
        double y1 = Double.parseDouble(inputArr[3]);
        
        double num = Math.sqrt(Math.pow(x1-x0, 2) + Math.pow(y1-y0, 2));
        System.out.print(num);
    }
}
