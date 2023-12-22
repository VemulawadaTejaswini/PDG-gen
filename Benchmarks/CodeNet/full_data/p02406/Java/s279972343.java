import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        StringBuilder build = new StringBuilder();
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%3 == 0){
                build.append(" "+i);
            }else if(i%10 == 3){
                build.append(" "+i);
            }
        }
        System.out.print(build);
    }
}