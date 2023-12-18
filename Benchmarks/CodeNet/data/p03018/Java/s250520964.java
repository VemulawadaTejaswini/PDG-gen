import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int count = 0;
        
        String s = stdIn.next();
        char c[] = s.toCharArray();
        
        for(int i = 0; i < c.length - 2; i++){
            if(c[i] == 'A'){
                if(c[i + 1] == 'B' && c[i + 2] == 'C'){
                    char tmp = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = c[i + 2]; 
                    c[i + 2] = tmp;
                    count++;
                    
                    if(i != 0){
                        if(c[i - 1] =='A'){
                            i -= 2;
                        }else{
                            i++;
                        }
                    }
                    
                }
            }else if(c[i + 1] != 'A' && c[i + 2] =='A'){
                i++;
            }
        }
        System.out.println(count);
    }
}
