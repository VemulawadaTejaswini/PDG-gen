import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < n ; i++ ){
                BigDecimal budget1 = new BigDecimal(br.readLine());
                if(budget1.toString().length()>=80){
                    System.out.println("overflow");
                    continue;
                }
                BigDecimal budget2 = new BigDecimal(br.readLine());
                if(budget2.toString().length()>=80){
                    System.out.println("overflow");
                    continue;
                }
                String result = budget1.add(budget2).toString();
                if(result.length()>=80){
                    System.out.println("overflow");
                    continue;
                }
                System.out.println(budget1.add(budget2));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}