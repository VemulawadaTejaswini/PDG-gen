import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(c%i==0){
                count++;
            }
        }
        System.out.printf("%d\n",count);
    }

}

