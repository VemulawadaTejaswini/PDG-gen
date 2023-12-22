import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.next();

            int sum = 0;
            int ans = 0;

            for(int i = 0; i < s.length() - 2; i++){
                sum = 0;
                sum += Integer.parseInt(s.substring(i, i + 1));

                for(int j = i + 1; j < s.length(); j++){
                    sum += Integer.parseInt(s.substring(j, j + 1));
                    if(sum % 3 == 0){
                        BigInteger subNum = new BigInteger(s.substring(i, j + 1));
                        if(subNum.remainder(BigInteger.valueOf(673)).equals(BigInteger.ZERO)){
                            ans++;
                            break;
                        }
                    }
                }
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}