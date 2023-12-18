import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int oddw=0;
        int oddb=0;
        int evenw=0;
        int evenb=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    evenw++;
                }else{
                    evenb++;
                }
            }else{
                if(s.charAt(i)=='1'){
                    oddw++;
                }else{
                    oddb++;
                }
            }
        }
        System.out.println(Math.min(oddb+evenw, oddw+evenb));
    }

}
