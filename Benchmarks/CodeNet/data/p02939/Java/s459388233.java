import java.util.*;
class Main{
    public static void main(String[]$){
        Scanner s=new Scanner(System.in);
        char[] c=s.next().toCharArray();
        int k=c.length;
        for(int i=0,w=0;i<c.length;++i){
            if(c[i++]!=w){
                w=c[--i];
            } else{
                w=0;
                --k;
            }
        }
        System.out.println(k);
    }
}
