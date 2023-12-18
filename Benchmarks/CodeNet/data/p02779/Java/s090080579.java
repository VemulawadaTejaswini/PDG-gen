import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[sc.nextInt()];
        String b = "YES";
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            for(int j = 0; j < i; j++){
                if(num[i] == num[j]){
                    b = "NO";
                }
            }
        }
        System.out.println(b);
    }
}