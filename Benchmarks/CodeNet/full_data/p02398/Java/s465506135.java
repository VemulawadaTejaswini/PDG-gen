import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;

        //String[] num = str.split(" ",0);
        int i = 1;
        int sum = 0;
        str = scan.nextLine();
        String[] num = str.split(" ",0);
        for(i = Integer.valueOf(num[0]); i <= Integer.valueOf(num[1]); i++){
            if(Integer.valueOf(num[2]) % i == 0){
                sum++;
            }
        }


        System.out.println(sum);
        scan.close();
        
    }

}

