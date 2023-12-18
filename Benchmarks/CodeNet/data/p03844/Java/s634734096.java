import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String formula = sc.nextLine();
        String[] formulaArray = formula.split(" ");
        int A = Integer.parseInt(formulaArray[0]);
        String op = formulaArray[1];
        int B = Integer.parseInt(formulaArray[2]);
        int ans = 0;
        switch (op) {
        case "+":
            ans = A + B;
            break;
        case "-":
            ans = A - B;
        default:
            break;
        }
        System.out.println(ans);
    }

}