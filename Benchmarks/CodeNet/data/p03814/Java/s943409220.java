import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pa = Integer.MAX_VALUE;
        int pz = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') pa = Math.min(pa,i);
            if(s.charAt(i)=='Z') pz = Math.max(pz,i);
        }
        System.out.println(pz-pa+1);
    }
}
