import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        String[] array = new String[n];
        String s = scan.nextLine();

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextLine();
        }


        loop : for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if(array[i].equals(array[j])) {
                        continue loop;
                    }
                }
                count++;
            }   



        
        System.out.println(count);
 
        scan.close();
    }
}