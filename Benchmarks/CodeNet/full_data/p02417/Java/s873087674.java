import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        int[] arrays = new int[26];
        while(sc.hasNext()){
            string+=sc.nextLine();
        }
        for(int i = 0; i < string.length(); i++){
            int temp = string.charAt(i);
            if('A'<= temp && temp <= 'Z'){
                arrays[temp - 'A']++;
            }else if('a' <= temp && temp <= 'z'){
                arrays[temp - 'a']++;
            }
        }
        for(int i = 0; i < arrays.length; i++){
            System.out.println((char)('a' + i) + " : " + arrays[i]);
        }
    }
}