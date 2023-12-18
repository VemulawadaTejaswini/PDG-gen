import java.util.Scanner;
public class Main{
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        
        int white=0;
        int black=0;
        
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
        System.out.println(count);
    }
}
