import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int taro = 0;
        int hanako = 0;
        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            int result = str1.compareTo(str2);
            if(result == 0) {
                taro++;
                hanako++;
            }else if(result < 0){
                hanako += 3;
            }else{
                taro += 3;
            }
        }
        sc.close();

        System.out.println(taro +" "+hanako);
    }

}