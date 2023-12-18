package palindrom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
           for(int j=0;j<i;j++){
               if(S.charAt(i)==S.charAt(j)){
                   count++;
               }
           }
            
        }
        System.out.println(count-1);

    }
}
