import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();
        char[] split_S = new char [S.length()];
        for(int i=0;i<S.length();i++){
            split_S[i] = S.charAt(i);
        }
        if(S.length() <= K){
            for(int i=0;i<S.length();i++){
                if(i != i-1){
                    System.out.print(split_S[i]);
                }
                else{
                    System.out.println(split_S[i]);
                }
            }
        }
        else{
            for(int i=0;i<S.length();i++){
                if(i != K-1){
                    System.out.print(split_S[i]);
                }
                else{
                    System.out.println(split_S[i]+"...");
                    break;
                }
            }
        }

        scanner.close();
    }
}