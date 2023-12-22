import java.util.*;
class Main{
  public static void main(String[] a){
    String b =" ";
    String c =" ";
    Scanner k = new Scanner( System.in);
    try{
      while(k.hasNextLine()){
        String line = k.nextLine();
        StringTokenizer st = new StringTokenizer(line);
        int count=0;
        while(st.hasMoreTokens()){
          if(count==1){
            c=st.nextToken();
          }
          if(count==0){
            b = st.nextToken();
            count++;
          }
        }
        long dividend=0;
        long divisor=0;
        long remainder=1;
        long i = Long.parseLong(b);
        long j = Long.parseLong(c);
        if(i>j){
          dividend = i;
          divisor = j;
        }else{
          dividend = j;
          divisor = i;
        }
        while(remainder!=0){         
          remainder = dividend%divisor;
          dividend = divisor;
          
          if(remainder==0){
            break;
          }else{
            divisor = remainder;
          }
        }
        long lcm = (i*j)/divisor;
        System.out.println(divisor+" "+lcm);
        
      }
      
    }finally{
      k.close();
    }
  }
}