import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
 
        int word_length = word.length();
        char wordAtindex = 'A';
        int index = 0;
        int max_sequential = 0;
        for (int i=0; i<word_length; i++)  {
            wordAtindex = word.charAt(i);
 
            if (wordAtindex=='A') {
                index++;
            } else if (wordAtindex=='T') {
                index++;
            } else if (wordAtindex=='C') {
                index++;
            } else if (wordAtindex=='G') {
                index++;
            } else {
                max_sequential = Math.max(index, max_sequential);
                index = 0;
            }
        }
        System.out.print(max_sequential);
    }
}