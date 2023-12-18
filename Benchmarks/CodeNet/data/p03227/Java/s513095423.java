import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int tkh = sc.nextInt();
        int aok = sc.nextInt();
        int k = sc.nextInt();
        
        for(int i = 1; i <= k; i++){
            if(i % 2 == 1){ //全体の奇数回は高橋の番
                if(tkh % 2 == 1){
                    tkh--;
                    aok += tkh / 2;
                    tkh /= 2;
                    
                }else{
                    aok += tkh / 2;
                    tkh /= 2;
                }
                //System.out.println(tkh + " " + aok);
               
            }else{
                if(aok % 2 == 1){
                    aok--;
                    tkh += aok / 2;
                    aok /= 2;
                }else{
                    tkh += aok / 2;
                    aok /= 2;
                }
                //System.out.println(tkh + " " + aok);
            }

        }
         
         System.out.println(tkh + " " + aok);
        
    }
}
