import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int result;

            int nowT=Integer.paseInt(cin.next());
            int addT=Integer.paseInt(cin.next());

            if(nowT+addT>23){
                result = nowT+addT-24;
            }else{
                result = nowT+addT;
            }
            System.out.println(result);
    }
}