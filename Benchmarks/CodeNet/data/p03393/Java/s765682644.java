import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean valid = true;
        int[] freq = new int[26];
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c-'a' > 26 || c-'a' < 0){
                valid = false;
                break;
            }
            if(freq[c-'a'] > 0){
                valid = false;
                break;
            }else{
                freq[c-'a']++;
            }
        }
        if(!valid){
            System.out.println(-1);
        }else{
            if(word.length() == 26){
                char[] str = word.toCharArray();
                int i= str.length-2;
                while(i >= 0 && str[i] > str[i+1]){
                    i--;
                }
                if(i < 0){
                    System.out.println(-1);
                }else{
                    int j = str.length - 1;
                    while (j >= 0 && str[j] <= str[i]) {
                        j--;
                    }
                    str[i] = str[j];
                    String newword = String.valueOf(str);
                    System.out.println(newword.substring(0,i+1));
                }
            }else{
                for(int i=0;i<freq.length;i++){
                    if(freq[i] == 0){
                        System.out.println(word+((char)(i+'a')));
                        System.exit(1);
                    }
                }
            }
        }

    }
}
