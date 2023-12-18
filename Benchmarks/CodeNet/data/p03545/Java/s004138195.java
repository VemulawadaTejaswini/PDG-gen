import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[4];
        a[0] = Character.getNumericValue(str.charAt(0));
        a[1] = Character.getNumericValue(str.charAt(1));
        a[2] = Character.getNumericValue(str.charAt(2));
        a[3] = Character.getNumericValue(str.charAt(3));
        int I = 4;
        boolean test = true; 
        //int[] m = new int[N];
        int ans = a[0]+a[1]+a[2]+a[3];
        int ans2 = ans;
        if((a[0]+a[1]+a[2]+a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]-a[1]+a[2]+a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]+a[1]-a[2]+a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]+a[1]+a[2]-a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
        }else if((a[0]-a[1]-a[2]+a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]-a[1]+a[2]-a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
        }else if((a[0]+a[1]-a[2]-a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
        }else if((a[0]-a[1]-a[2]-a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
        }
        //System.out.println(a[0]);
    }
}
