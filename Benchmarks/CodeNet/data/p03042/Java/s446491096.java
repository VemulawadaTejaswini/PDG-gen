import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int s1 = Integer.parseInt(s.substring(0,2));
        int s2 = Integer.parseInt(s.substring(2,4));
        int jnum = 4;//1,yymm 2,mmyy 3,ambiguous 4,na

        if((s1 > 12 && (1<=s2 && s2<=12)) || (s1 == 0 && (1<=s2 && s2<=12))){
            jnum = 1;
        }else if(((1<=s1 && s1<=12) && s2 > 12) || ((1<=s1 && s1<=12) && s2 == 0)){
            jnum = 2;
        }else if((1<=s1 && s1<=12) && (1<=s2 && s2<=12)){
            jnum = 3;
        }else if((s1 > 12 && s2> 12)||(s1 == 0 && s2 == 0)){
            jnum = 4;
        }

        if(jnum == 1){
            System.out.println("YYMM");
        }else if(jnum == 2){
            System.out.println("MMYY");
        }else if(jnum == 3){
            System.out.println("AMBIGUOUS");
        }else if(jnum == 4){
            System.out.println("NA");
        }
    }
}
