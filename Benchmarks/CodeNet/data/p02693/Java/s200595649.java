import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        boolean isOk = false;

        Scanner sc = new Scanner(System.in);
        int target = Integer.parseInt(sc.next());
        int minDistance = sc.nextInt();
        int maxDistance = sc.nextInt();

        for (int i=minDistance;i <= maxDistance;i++){
            if (i%target == 0){
                isOk = true;
                break;
            }
        }
        System.out.println(isOk);
    }
}
