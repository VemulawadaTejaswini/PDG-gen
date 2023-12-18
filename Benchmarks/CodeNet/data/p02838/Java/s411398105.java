import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Long[] numbers = new Long[num];

        for(int i = 0; i < num; i++)
          numbers[i] = Long.parseLong(sc.next());

        long total = 0;
        for(int i = 0; i < num-1; i++){
          for(int j = i+1; j < num; j++){
            //System.out.println(i + " " + j + " " + Integer.parseInt(xorbinary(numbers[i], numbers[j]), 2));
            total += numbers[i]^numbers[j];
          }
        }

        System.out.println(total%1000000007);
    }

    static String xorbinary(long numA, long numB){

      String aBinary = Long.toBinaryString(numA);
      String bBinary = Long.toBinaryString(numB);

      StringBuffer sb;
      if(!aBinary.substring(aBinary.length()-1,aBinary.length()).equals(bBinary.substring(bBinary.length()-1,bBinary.length()))){
        sb = new StringBuffer("1");
      }else{
        sb = new StringBuffer("0");
      }

      if(aBinary.length() == bBinary.length()){ //文字数が同じ
        for(int i = aBinary.length()-2; i >= 0; i--){
          if(!aBinary.substring(i, i+1).equals(bBinary.substring(i, i+1)))
            sb.insert(0, "1");
          else
            sb.insert(0, "0");
        }
      }else if(aBinary.length() < bBinary.length()){ //aの方が文字数が少ない時
        for(int i = aBinary.length()-2; i >= 0; i--){
          if(!aBinary.substring(i, i+1).equals(bBinary.substring(i, i+1)))
            sb.insert(0, "1");
          else
            sb.insert(0, "0");
        }

        for(int i = bBinary.length()-aBinary.length()-1; i >= 0; i--){
          if(bBinary.substring(i, i+1).equals("1"))
            sb.insert(0, "1");
          else
            sb.insert(0, "0");
        }
      }else{ //bの方が文字数が少ない時
        for(int i = bBinary.length()-2; i >= 0; i--){
          if(aBinary.substring(i, i+1).equals(bBinary.substring(i, i+1)))
            sb.insert(0, "1");
          else
            sb.insert(0, "0");
        }

        for(int i = aBinary.length()-bBinary.length()-1; i >= 0; i--){
          if(bBinary.substring(i, i+1).equals("1"))
            sb.insert(0, "1");
          else
            sb.insert(0, "0");
        }
      }

      return sb.toString();
    }
}