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
        
        int min;
        if (white>black){
            min=black;
        } else {
            min=white;
        }
        int count = 0;
        boolean flag = true;
        for (int index=0; index<N; index++){
            if (flag){
                if (S.charAt(index)=='#'){
                    flag=false;
                }
            } else {
                if (S.charAt(index)=='.'){
                    count++;
                }
            }
        }
        
        if (min>count){
            System.out.println(count);
        } else {
            System.out.println(min);
        }
    }
}
