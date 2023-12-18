import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.next();
        int count = 0;
        
        char words[] = new char[s1.length()];
        for(int i = 0; i < s1.length(); i++){
            words[i] = s1.charAt(i);
        }
        
        // check first A
        if(words[0] == 'A'){
            count++;
            words[0] = 'a';
        }
        
        // check C
        int cCount = 0;
        for(int i = 2; i < s1.length() - 1; i++){
            if(words[i] == 'C'){
                cCount++;
                words[i] = 'c';
            }
        }
        
        if(cCount == 1){
            count++;
        }
        
        // check small chalacter
        for(int i = 1; i < s1.length(); i++){
            if(Character.isUpperCase(words[i])){
                count--;
            }
        }
        
        if(count == 2){
            System.out.println("AC");
        }else{
            System.out.println("WA");
        }
        
    }
}
