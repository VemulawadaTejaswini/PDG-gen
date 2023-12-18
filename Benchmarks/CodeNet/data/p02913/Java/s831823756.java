import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int res = n/2;
        while(res>0){
            int l1 = 0;
            while(n-l1-res>=res){
                int l2 = l1+res;
                while(n-l2-res>=0){
                    String a = s.substring(l1, l1+res);
                    String b = s.substring(l2, l2+res);
                    if(a.equals(b)){
                        System.out.println(res);
                        return;
                    }
                    l2++;
                }
                l1++;
            }
            res--;
        }
        System.out.println(0);
    }
}
