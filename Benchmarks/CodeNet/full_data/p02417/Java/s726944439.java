import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] counter = new int[26];
        int flag=0;
        while (true) {
            String in = sc.nextLine();
            in=in.toLowerCase();
            for (int i = 0; i < in.length(); i++) {
          
                int value = in.charAt(i)-'a' ;
                if(value==-65){
                    continue;
                }
                if(value==-51){
                    flag=1;
                    break;
                }
           
               
                counter[value]++;
            }
            
            if(flag==1){
                break;
            }
        }
        for (int i = 0; i < 25; i++) {
            System.out.printf("%c:%d\n", i + 'a', counter[i]);
        }
        sc.close();
    }
}
