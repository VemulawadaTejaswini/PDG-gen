import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int w=sc.nextInt();
        int output=0;
        int tmpa;
        int tmpb;
        for(int i=0;i<n;i++){
            tmpa=sc.nextInt();
            tmpb=sc.nextInt();
            if((tmpa>=h&&tmpb>=w)||(tmpb>=h&&tmpa>=w)){
                output++;
            }
        }
        System.out.println(output);
    }
 
    
}