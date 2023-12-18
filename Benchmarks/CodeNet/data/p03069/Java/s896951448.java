import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        String S[] = line.split("");
        int count1 = 0;
        int count2 = 0;
        for(int i = N - 1 ; i > 0 ; i--){
            if(S[i].equals("#")){
                count1++;
            }
        }
        for(int i = 0; i < N - 1 ; i++){
            if(S[i].equals("#")){
                if(S[i+1].equals(".")){
                    S[i+1] = "#";
                    count2++;
                }
            }
        }
        
        if(count1 > count2){
            System.out.println(count2);
        }else{
            System.out.println(count1);
        }
        
        
    }
}