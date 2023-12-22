import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        printAnswer();
    }
 
    private static void printAnswer() {
    		Scanner scan = new Scanner(System.in);
            int n = Integer.valueOf(scan.nextLine());
            String[] S = scan.nextLine().split(" ");
            int q = Integer.valueOf(scan.nextLine());
            String[] T = scan.nextLine().split(" ");
            int count = 0;
 
            for(int i = 0; i < n; i++){
                for(int j = 0; j < q; j++){
                    if(S[i].equals(T[j])){
                        count++;
                    }
                }
            }
           
            System.out.println(count);

            scan.close();
    }
 
}