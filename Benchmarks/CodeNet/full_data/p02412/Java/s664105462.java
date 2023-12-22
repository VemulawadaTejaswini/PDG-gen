import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,j,a,b,sum;
        while(true){
            str = scan.nextLine();
            String[] num = str.split(" ", 0);
            a = Integer.valueOf(num[0]);
            b = Integer.valueOf(num[1]);
            if(a==0&&b==0){
                break;
            }
            sum = calc(a,b,0);
            System.out.println(sum);

        }


        scan.close();
    }
    public static int  calc(int a, int b,int c){
        int res;
        if(b < 0 || a < 0||c > 3){
            return 0;
        }else if(b == 0&&c == 3){
            return 1;
        }else{
            return calc(a-1, b, c) + calc(a-1, b-a, c+1);
        }
    }
}



