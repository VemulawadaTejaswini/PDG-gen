import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author mihira
 *
 */
public class Main {
    
    static final String keyAc = "AC";
    
    static final String keyWa = "WA";
    
    static final String keyTle = "TLE";

    static final String keyRe = "RE";
    
    static final String cntLiteral = " x ";
    
    
    public static void main(String[] args) {
        
        //　入力された値を受け取る
        Scanner scanner = new Scanner(System.in);
        
        List<String> list = new ArrayList<>();
        
        int cntNum = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < cntNum ; i++) {
            String getData = scanner.nextLine();
            list.add(getData);
        }
        
        // 保持した値をイコールズメソッドで比較
        
        int cntAc = 0;
        
        int cntWa = 0;
        
        int cntTle = 0;
        
        int cntRe = 0;
        
        
        for(int cntupNum = 0; cntupNum< cntNum; cntupNum++){  
                
            switch(list.get(cntupNum)) {
                case keyAc:
                    cntAc++;
                    break;
                    
                case keyWa:
                    
                    cntWa++;
                    break;
                    
                case keyTle:
                    
                    cntTle++;
                    break;
                    
                case keyRe:
                    
                    cntRe++;
                    break;
                    
                
            }
            
            
        
        }

        System.out.println(keyAc+cntLiteral+cntAc);
        
        System.out.println(keyWa+cntLiteral+cntWa);
        
        System.out.println(keyTle+cntLiteral+cntTle);
        
        System.out.println(keyRe+cntLiteral+cntRe);
    }

}
