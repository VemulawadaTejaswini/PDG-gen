import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str[];
        str = new String[5];
        int num[];
        num = new int[5];
        for(int i=0; i<=4; i++)
            {
            str[i] = in.next();
            num[i] = Integer.parseInt(str[i]);
            }
        if(num[4]<=num[2] && num[4]<=num[3] && num[2]<=num[0]-num[4] && num[3]<= num[1]-num[4])
            {
            System.out.println("Yes");
            }else{
            System.out.println("No");
            }
    }
}