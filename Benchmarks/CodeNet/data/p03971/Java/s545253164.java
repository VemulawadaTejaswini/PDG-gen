import java.util.Scanner;

/**
 * Created by yufeng.fyf on 16/10/10.
 */
public class Main {
    private static String temple = "CODEFESTIVAL2016";
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int a_i = 0,b_i = 0;
        for(int i=0;i<n;i++){
            char p = s.charAt(i);
            if(a_i+b_i<a+b){
                if(p=='a'){
                    System.out.println("Yes");
                    a_i++;
                }
                else if(p=='b'){
                    if(b_i<b){
                        System.out.println("Yes");
                        b_i++;
                    }
                    else
                        System.out.println("No");

                }
                else
                    System.out.println("No");
            }
            else
                System.out.println("No");

        }

    }
}
