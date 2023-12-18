import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int m = stdIn.nextInt();
        int[] d = new int[m];
        int[] c = new int[m];
        for(int i=0; i<m; i++){
            d[i] = stdIn.nextInt();
            c[i] = stdIn.nextInt();
        }

        int temp = 0;
        int counter = -1;
        for(int i=0; i<m; i++){
            for(int j=0; j<c[i]; j++){
                temp += d[i];
                counter++;
                while(temp >= 10){
                    temp = (temp / 10) + (temp % 10);
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}