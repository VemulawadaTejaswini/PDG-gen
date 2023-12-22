import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alphabet = new int[26];
        
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char ch[] = str.toCharArray();
    
            for(int i=0; i<str.length(); i++){
                int cnt = Character.toLowerCase(ch[i])-'a';
                if(0 <= cnt && cnt <= 26){
                    alphabet[cnt] += 1;;
                }
            }
        }
        
        for(int i=0; i < 26; i++){
            System.out.println((char)('a' + i ) + " : " + Integer.toString(alphabet[i]));
        }
    }
}
