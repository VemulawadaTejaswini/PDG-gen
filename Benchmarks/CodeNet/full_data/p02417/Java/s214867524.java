import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] alphabet = new int[26];
 
        do {
            String s = input.nextLine();
            for (char c : s.toCharArray()){
                if ((c < 'A' || 'Z' < c) && (c < 'a' || 'z' < c)) continue;
                alphabet[Character.toLowerCase(c)- 'a']++;
            }
        } while (input.hasNext());
 
        for (char c = 'a'; c <= 'z'; c++){
            System.out.println(c + " : " + alphabet[c - 'a']);
        }
    }
}
