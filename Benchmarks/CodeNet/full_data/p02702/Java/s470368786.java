import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int count = 0;
        List<BigDecimal> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for(int j=1; j<s.length()-i+1; j++){
                String str = s.substring(i, i+j);
                BigDecimal bd = new BigDecimal(str);
                list.add(bd);
            }
        }
        BigDecimal mod = new BigDecimal(2019);
        for (BigDecimal val : list) {
            if(val.remainder(mod).intValue()==0){
                count += 1;
            }
        }
        System.out.println(count);
    }
 
}