import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] alphabet = new int[26];

        for (String s = input.nextLine(); input.hasNext(); s = input.nextLine()){
            for (char c : s.toCharArray){
                if (c < 'A' || 'Z' < c) continue;
                c = Character.toUpperCase(c) - 'A';
                alphabet[c]++;
            }
        }

        for (int i = 0; i < 26; i++){
            System.out.printf("%c : %d\n", 'a' + i, alpabet[i]);
        }
    }
}