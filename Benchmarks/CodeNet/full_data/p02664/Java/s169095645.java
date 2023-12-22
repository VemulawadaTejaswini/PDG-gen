import java.util.Arrays;
import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine();
        String[] ar = line.split("");

        for (int i = 0; i < ar.length; i++) {
            try{
                if(ar[i].equals("?")) {
                    if (i == 0) {
                        if (ar[i + 1].equals("D")) {
                            ar[i] = "P";
                        } else if (ar[i + 1].equals("P")) {
                            ar[i] = "D";
                        } else if (ar[i + 1].equals("?")) {
                            ar[i] = "P";
                        }
                    } else if (i == ar.length - 1) {
                        ar[i] = "D";
                    } else {
                        if (ar[i - 1].equals("P")) {
                            ar[i] = "D";
                        } else if (ar[i - 1].equals("D")) {
                            if (ar[i + 1].equals("P")) {
                                ar[i] = "D";
                            } else {
                                ar[i] = "P";
                            }
                        }
                    }
                }
            } catch(Exception e) {
                ar[i] = "D";
            }
        }
        Arrays.stream(ar).forEach(e -> System.out.print(e));
    }
}