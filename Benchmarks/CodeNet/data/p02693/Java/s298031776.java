import java.util.Scanner;

public class Main {
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
        if(isOk){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}
