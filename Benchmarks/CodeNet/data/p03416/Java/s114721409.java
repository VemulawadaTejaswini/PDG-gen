import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        int num = a;

        while(num <= b){
            String numa = String.valueOf(num);
            StringBuffer numb = new StringBuffer(numa);

            if(numa.contentEquals(numb.reverse())){
                count++;
            }
            num++;
        }
        System.out.println(count);


    }
}
