            import java.util.Scanner;
             
            public class Main{
              public static void main(String[] args){
             
                Scanner scan = new Scanner(System.in);
             
                String word = scan.nextLine();
                int length = word.length();
             
                if (isPalindrome(word) && isPalindrome(word.substring(0, (length-1)/2)) && isPalindrome(word.substring(((length+3)/2)-1, length))){
                  System.out.println("Yes");
                }
                else {
                  System.out.println("No");
                }
              }
             
              public static boolean isPalindrome(String string){
                for(int i = 0; i < string.length()/2; i++){
                  if (string.substring(i).compareTo(string.substring(string.length()-1-i)) == 0){
                    return false;
                  }
                }
                return true;
              }
            }