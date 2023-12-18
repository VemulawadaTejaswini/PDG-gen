import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        String e = sc.next();
        String[] oArray = o.split("");
        String[] eArray = e.split("");
        int max = 0;
        if(oArray.length < eArray.length){
            max = eArray.length;
        }else{
            max = oArray.length;
        }
        for(int i = 0; i < max; i++){
            if(oArray.length < eArray.length){
                System.out.print(eArray[i]);
                System.out.print(oArray[i]);
            }else{
                System.out.print(oArray[i]);
                System.out.print(eArray[i]);
            }
        }
    }
}