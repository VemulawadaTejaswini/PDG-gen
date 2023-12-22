import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] count = new int[10001];

        for(int x=1;x<101;x++){
            for(int y=1;y<101;y++){
                for(int z=1;z<101;z++){
                    int calc = x*x + y*y + z*z + x*y + y*z + z*x;
                    if(calc <= 10000){
                        count[calc]++;
                    }else{
                        break;
                    }
                }
            }
        }

        for (int i=1;i<=n;i++){
            System.out.println(count[i]);
        }

    }
}
