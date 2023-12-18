import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String line = sc.next();
        String S2[] = line.split("");
        String S3[] = line.split("");
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = N - 1 ; i > 0 ; i--){
            if(S2[i].equals("#")){
                count1++;
            }
        }
        for(int i = 0; i < N - 1 ; i++){
            if(S2[i].equals("#")){
                if(S2[i+1].equals(".")){
                    S2[i+1] = "#";
                    count2++;
                }
            }
        }
        for(int i = N-1; i > 0 ; i--){
            if(S3[i].equals(".")){
                if(S3[i-1].equals("#")){
                    S3[i-1] = ".";
                    count3++;
                }
            }
        }
        
        if(count1 > count2){
            if(count2 > count3){
                System.out.println(count3);
            }else{
                System.out.println(count2);
            }
        }else{
            System.out.println(count1);
        }
        
        
    }
}
