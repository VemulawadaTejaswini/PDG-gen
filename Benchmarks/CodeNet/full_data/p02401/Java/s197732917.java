import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
        public static void main(String[] args) throws Exception {
    	String[] op = {"+","-","*","/"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            BigDecimal n = new BigDecimal(0);
            String line = br.readLine();
            String[] ary = line.split(" ");
            if(ary[1].equals("?"))
                break;
            else {
                BigDecimal in1 = new BigDecimal(ary[0]);
                BigDecimal in2 = new BigDecimal(ary[2]);
                switch(Matching(op,ary[1])) {
                    case 0:
                        n = in1.add(in2);
                        break;
                    case 1:
                        n = in1.subtract(in2);
                        break;
                    case 2:
                        n = in1.multiply(in2);
                        break;
                    case 3:
                        n = in1.divideToIntegralValue(in2);
                        break;
                }
                System.out.println(n.toPlainString());
            }

        }
    }
    private static int Matching(String[] str,String target) {
    	for(int i=0;i<str.length;i++) {
    		if(str[i].equals(target)){
    			return i;
    		}
    	}
		return 0;
    }
}