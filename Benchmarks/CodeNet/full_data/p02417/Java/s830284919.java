import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a[] = new int[26];
        int i;
        
        while(sc.hasNext()){
            String x = sc.next();

            for(i = 0;i < x.length();i++){
                char c = x.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    a[c - 97]++;
                }
                else if(c >= 'A' && c <= 'Z'){
                    a[c - 65]++;
                }
            }
        }

        for(i = 0;i < 26;i++){
            System.out.printf("%c : %d\n",(i + 97),a[i]);
        }

    }
}
