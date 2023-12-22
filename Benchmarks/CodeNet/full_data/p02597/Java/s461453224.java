
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        int i=0,j=s.length()-1;
        int count=0;
        while(i<j){
            if(s.charAt(i)=='W' && s.charAt(j)=='R'){
                count++;
                i++;
                j--;
            }
            else{
                if(s.charAt(i)=='R' && s.charAt(j)=='W'){
                    i++;j--;
                }else{

                    if(s.charAt(i)=='W'){
                        j--;
                    }else{
                        i++;
                    }


                }
            }
        }
        System.out.println(count);
    }
}
