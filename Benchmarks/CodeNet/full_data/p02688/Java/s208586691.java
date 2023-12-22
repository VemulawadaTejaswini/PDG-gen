import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String newLine;
        int ppl, snackKind, havingSnackTotal, treated;
        boolean hasSnack[];

        ppl = scan.nextInt();
        snackKind = scan.nextInt();
        newLine = scan.nextLine();
        
        hasSnack = new boolean[ppl];
        for(int i = 0; i < hasSnack.length; i++) {
            hasSnack[i] = false;
        }

        for(int k = 0; k < snackKind; k++) {
            havingSnackTotal = scan.nextInt();
            newLine = scan.nextLine();
            
            for(int p = 0; p < havingSnackTotal; p++) {
                hasSnack[scan.nextInt() - 1] = true;
            }
            newLine = scan.nextLine();
        }

        treated = 0;
        for(int i = 0; i < hasSnack.length; i++) {
            if(!hasSnack[i]) {
                treated++;
            }
        }
        System.out.println(treated);
        scan.close();
        return;
    }
}