
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        if(N==0){
            System.out.println(0);
            return;
        }
        StringBuilder reverseResult=new StringBuilder();
        int count=0;
        while(N-func(reverseResult.toString())!=0){
            //System.out.println(count+":"+(N-func(reverseResult.toString())));
            if((N-func(reverseResult.toString()))%(2<<reverseResult.length())==0){
                reverseResult.append(0);
            }else{
                reverseResult.append(1);
            }
            count++;
        }
        System.out.println(reverseResult.reverse());
    }
    public static long func(String reverseString){
        long result=0;
        for(int i=0;i<reverseString.length();i++){
            if(reverseString.charAt(i)=='1'){
                result+=(i%2==0?1:-1)*(1<<i);
            }
        }
        return result;
    }


}
