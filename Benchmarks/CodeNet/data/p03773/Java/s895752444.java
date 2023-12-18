import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        int nowT;
        int addT;
        int result;
            nowT=Integer.paserInt(cin.next());
            addT=Integer.paserInt(cin.next());

            if(nowT+addT>23){
                result = nowT+addT-24;
            }else{
                result = nowT+addT;
            }
            System.out.println(result);
    }
}