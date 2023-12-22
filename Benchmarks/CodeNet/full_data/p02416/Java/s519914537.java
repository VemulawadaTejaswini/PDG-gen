import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

            int a = sc.nextInt();
            int sum = 0;

            for (int i=1; ;i++){
                int b = a % 10;
                a = (a-b)/10;
                sum = sum + b;
                if(a==0)
                    break;
            }
            if(sum==0)
                break;

            System.out.printf("%d\n",sum);
        }
    }
}

