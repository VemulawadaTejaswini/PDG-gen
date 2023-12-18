import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int i = 1;
        while(true){
            if((int)Math.pow(B,i)>=A){
                if(B==10 && (int)Math.pow(B,i)==A)i+=1;
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
