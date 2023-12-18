import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int need_longer = sc.nextInt();
        int sum = 0;
        int longer[] = new int[people];
        for (int i = 0; i < people; i++) {
            longer[i] = sc.nextInt();
            if(longer[i]>=need_longer){
                sum++;
            }
        }
        System.out.println(sum);
    }

}