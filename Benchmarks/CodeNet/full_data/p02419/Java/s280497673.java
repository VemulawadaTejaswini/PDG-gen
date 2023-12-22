import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        String[] T = new String[10000];
        int i = 0;
        do{
            T[i] = sc.next();
            if(T[i].equals("END_OF_TEXT")){
                break;
            }
            T[i] = T[i].toLowerCase();
            i++;
        } while (true);
        int wordCount = 0;
        for (int j = 0; j < i; j++) {
            if (W.equals(T[j])) {
                wordCount++;
            }
        }
        System.out.println(wordCount);
        sc.close();
    }   
}
