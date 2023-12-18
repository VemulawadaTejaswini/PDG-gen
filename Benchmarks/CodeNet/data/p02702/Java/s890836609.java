import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        long count = 0;
        for (int i = 0; i <str.length() ; i++) {
            int mod =0;
            for (int j = i; j <str.length() ; j++) {
                mod=(mod*10+Integer.parseInt(str.substring(j,j+1)))%2019;
                if (mod==0){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}