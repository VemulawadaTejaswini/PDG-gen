import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      BigDecimal number = sc.nextBigDecimal();
      BigDecimal code = BigDecimal.ZERO;
      List<BigDecimal> codeList = new ArrayList<BigDecimal>();
      
      while(number.compareTo(BigDecimal.ZERO) > 0){
        code = number.remainder(new BigDecimal(26));
        codeList.add(code);
        number = number.divide(new BigDecimal(26), 0, RoundingMode.DOWN);
		if(number.equals(new BigDecimal(26))){
          number = number.subtract(BigDecimal.ONE);
        }
      }
      
      Collections.reverse(codeList);
      
      for(BigDecimal a : codeList){
        switch(a.intValue()){
          case 1:
            System.out.print("a");
        	break;
          case 2:
            System.out.print("b");
        	break;
          case 3:
            System.out.print("c");
        	break;
          case 4:
            System.out.print("d");
        	break;
          case 5:
            System.out.print("e");
        	break;
          case 6:
            System.out.print("f");
        	break;            
          case 7:
            System.out.print("g");
        	break;
          case 8:
            System.out.print("h");
        	break;           
          case 9:
            System.out.print("i");
        	break;            
          case 10:
            System.out.print("j");
        	break;            
          case 11:
            System.out.print("k");
        	break;            
          case 12:
            System.out.print("l");
        	break;           
          case 13:
            System.out.print("m");
        	break;            
          case 14:
            System.out.print("n");
        	break;            
          case 15:
            System.out.print("o");
        	break;           
          case 16:
            System.out.print("p");
        	break;            
          case 17:
            System.out.print("q");
        	break;            
          case 18:
            System.out.print("r");
        	break;            
          case 19:
            System.out.print("s");
        	break;            
          case 20:
            System.out.print("t");
        	break;            
          case 21:
            System.out.print("u");
        	break;            
          case 22:
            System.out.print("v");
        	break;            
          case 23:
            System.out.print("w");
        	break;            
          case 24:
            System.out.print("x");
        	break;          
          case 25:
            System.out.print("y");
        	break;            
          case 0:
            System.out.print("z");
        	break;            
        }
      }
	}
}