import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();
        int N = s.nextInt();
        Boolean check[] =  new Boolean[102];
        for(int i = 0; i < 102; i++){
            check[i] = true;
        } 
        for(int i = 0; i < N; i++ ) {
            check[s.nextInt()] = false;
        }
        int puraN = X;
        int maiN = X;
        int i = 0;
        int answer = X;
        while(!check[X]){
            if(i % 2 == 0){
                maiN -= 1;
                if(check[maiN]){
                    answer = maiN;
                    break;
                } 
            }
            if(i % 2 != 0){
                puraN += 1;
                if(check[puraN]){
                     answer = puraN;
                    break; 
                }
            }
            i += 1;
                
        }    
        
        System.out.println(answer); 
    }
}
