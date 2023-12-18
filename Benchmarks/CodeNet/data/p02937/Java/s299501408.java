import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strArray1 = line.split("");
        line = sc.nextLine();
        String[] strArray2 = line.split("");

        int i = 0;
        int j = 0;
        long result = 0;
        while(true){
            result++;
            if(strArray1[i].equals(strArray2[j])){
                j++;
                if(j == strArray2.length){
                    System.out.println(result);
                    System.exit(0);
                }
            }

            i++;
            if(i == strArray1.length){
                i = 0;
                if(j == 0){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
    }
}