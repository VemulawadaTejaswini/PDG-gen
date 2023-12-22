import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            for(int i = 0 ; i < n ; i++ ){
                BigInteger budget1 = new BigInteger(br.readLine());
                BigInteger budget2 = new BigInteger(br.readLine());
                if(budget1.toString().length() > 80 || budget2.toString().length() > 80){
                    System.out.println("overflow");
                    continue;
                }
                String result = budget1.add(budget2).toString();
                if(result.length()>80){
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