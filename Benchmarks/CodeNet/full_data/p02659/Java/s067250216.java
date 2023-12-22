import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long po=sc.nextLong();
        String s[]=sc.next().replace(".","A").split("A",0);
        long a;
        if(s.length==1){
            a=100*Long.parseLong(s[0]);
        }else{
            a=100*Long.parseLong(s[0]);
            a+=Long.parseLong(s[1]);
        }
        long sum=0;
        sum=(po/100)*a;
        long aa=(po%100)*a;
        System.out.println(sum+aa/100);
    }
}
