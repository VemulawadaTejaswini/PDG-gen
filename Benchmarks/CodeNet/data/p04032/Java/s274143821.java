import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] count = new int[26];
        int[] endPoint =  new int[26];
        boolean found = false;

        for(int i=0 ;i<str.length(); i++){
            char c =  str.charAt(i);
            count[c - 'a'] += 1;
            endPoint[c - 'a'] = i;
        }

        for(int i=0 ;i<str.length(); i++){
            char c =  str.charAt(i);

            if((endPoint[c - 'a'] - i + 1) >=  2 && count[c - 'a'] > (endPoint[c - 'a'] - i + 1)/2){
                System.out.println(i+1 + " "+ (endPoint[c - 'a'] +  1));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println(-1 +" "+ -1);
        }
    }
}