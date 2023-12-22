import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        String[] alfa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int[] count = new int[26];
        while(sc.hasNext()){
            str = sc.nextLine();
            String[] s = new String[str.length()];
            for(int i=0;i<str.length();i++){
                s[i] = String.valueOf(str.charAt(i));
            }
            for(int i=0;i<str.length();i++){
                for(int j=0;j<26;j++){
                    if(s[i].equalsIgnoreCase(alfa[j])) count[j]++;
                }
            }
        }
        for(int i=0;i<26;i++){
            System.out.println(alfa[i] + " : " +count[i]);
        }
    }
}
