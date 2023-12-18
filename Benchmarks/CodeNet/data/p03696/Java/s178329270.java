import java.util.*;

public class Main {

   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String seq = sc.next();
        int depth = 0;
        for (int i = 0; i < seq.length(); i++){
        	System.out.println(i + " :" + depth);
            if (seq.charAt(i) == '('){
                depth ++;
            }
            else{
                depth --;
            }
          if (depth < 0){
            seq =  String.valueOf('(').concat(seq);
            depth ++;
            i++;
          }
        }
      
        if (depth > 0){
            for (int i = 0; i < depth; i++){
                seq = seq.concat(String.valueOf(')'));
            }
        }
        
        System.out.println(seq);   
        
        sc.close();
	}
}