import java.util.Scanner;
import java.math.BigDecimal;


class Main{
  static public void main(String[] args){
      Scanner sc = new Scanner(System.in);
      RuteCalc rc = new RuteCalc(sc.nextLong());
      RuteCalc rc2 = new RuteCalc(sc.nextLong());
      RuteCalc rc3 = new RuteCalc(sc.nextLong());
      RuteCalc rc4 = new RuteCalc(rc.getRute(),rc2.getRute(),rc3.getRute());
  }
}
class RuteCalc{
    private int count = 0;
    private long i = 1;
    private long j = 0;
    private long ii = 0;
    private long x;
    private String rute ="";
    private BigDecimal b_rute;
    void RuteCalc(){

    }
    RuteCalc(long x){
      this.x = x;
        r_equals();
          while(rute.length() < 30){
            if(ii == x){
              break;
            }else{
              sec();
            }
          }
      b_rute = new BigDecimal(rute);
    }
    RuteCalc(BigDecimal p, BigDecimal q, BigDecimal r){
      BigDecimal add = p.add(q);
        if( (add.compareTo(r) > 0) == true){
            System.out.println("No");
        }else if(add.equals(r) == true){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
    void sec(){
      if( ii != x ){
        ii = ii / i - i;
        x = ( x - ( ii + j ) * j ) * 100;
        ii = (ii + j + j) * 10;
        i = 1;
        j = 0;
      }
      while(ii > x){
          rute += "0";
          x *= 100;
          ii *= 10;
      }
      while(ii < x){
        r_equals();
      }
    }
    void r_equals(){
      count++;
        while( ii < x ){
          iicalc();
            if( ii == x ){
              rute += String.valueOf(i);
            }else if(ii > x){
              rute += String.valueOf(j);
              if(count == 1){
                rute += ".";
              }
            }else{
              i++;
              j++;
            }
        }
    }
    void iicalc(){
      if(rute.length() == 0){
        ii = i * i;
      }else{
        try{
          if(j == 0){
          ii = ii + i ;
          }else{
            ii = ( ii / j - j + i ) * i;
          }
        }catch(ArithmeticException e){
          e.printStackTrace();
        }
      }
    }
    BigDecimal getRute(){
      return b_rute;
    }
}
