import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        String time =scn.next();
        int zero1 = Integer.parseInt(time.substring(0,2));
        int two3 = Integer.parseInt(time.substring(2,4));
        System.out.println(func(zero1,two3));
    }
    public static String func(int test1,int test2){
        if(0<test1&&test1<13){
            if(0<test2&&test2<13){
                return "AMBIGUOUS";
            }else{
                return "MMYY";
            }
        }else{
            if(0<test2&&test2<13){
                return "YYMM";
            }else{
                return "NA";
            }
        }
    }
}
