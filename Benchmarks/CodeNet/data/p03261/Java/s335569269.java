import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList <String> W = new ArrayList <String>();
        boolean judge = true;
        
        for(int i=0; i<N; i++){
            String tmp = sc.next();
            if(W.contains(tmp)){
                judge = false;
            }
            W.add(tmp);
            
        }
        

        for(int i=0; i<N-1; i++){
            String str1 = W.get(i);
            String str2 = W.get(i+1);
            int num = str1.length()-1;
            if(str1.charAt(num) == str2.charAt(0)){
                continue;
            }else{
                judge = false;
                break;
            }
        }
        
        if(judge == true) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
    
        }
    }
}
