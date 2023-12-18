
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        int ff=0;
        for(int j=0;j<ss.length();j++){
            if(j%2==0 && ss.charAt(j)!='h'){
                ff=1;
                break;
            }
            else if(j%2==1 && ss.charAt(j)!='i'){
                ff=1;
                break;
            }
        }
        if(ff==1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
