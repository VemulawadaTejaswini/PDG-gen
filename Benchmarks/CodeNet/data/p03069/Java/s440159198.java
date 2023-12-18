import java.util.Scanner;
public class Main{
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        
        int white=0;
        int black=0;
        for (int index=0; index<N; index++){
            if (S.charAt(index)=='#'){
                black++;
            } else {
                white++;
            }
            
        }
        
        if (white>black){
            
            if (S.charAt(N-1)=='#'){
                black--;
            }
            System.out.println(black);
            
        } else {
            if (S.charAt(0)=='.'){
                white--;
            }
            System.out.println(white);
        }
    }
}
