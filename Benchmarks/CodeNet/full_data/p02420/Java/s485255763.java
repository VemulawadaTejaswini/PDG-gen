import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String words;
        words = scan.next();
        int n, cuting;
        
        while(!words.equals("-")){
            n=scan.nextInt();
            
            for(int i=0; i<n; i++){
                cuting=scan.nextInt();
                words=words.substring(cuting)+words.substring(0, cuting);
            }
                System.out.println(words);
            words=scan.next();
        }
        
    }
}
