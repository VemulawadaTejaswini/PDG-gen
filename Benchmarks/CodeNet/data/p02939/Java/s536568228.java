import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char[] c = s.toCharArray();
        
        int count = 1;
        int length = s.length();
        for(int i = 0; i < length-1; i++){
            if(c[i] == c[i+1]){
                i += 2;
                if(i >= length){
                    break;
                }
                count++;
            }
            count++;
        }
        
        System.out.println(count);
    }
}