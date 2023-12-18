import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int k=sc.nextInt();
        int s=sc.nextInt();
    
        for(int i=0; i<=k; i++){
            if(k<=3){
                System.out.println(k*3);
                break;
            }else{
                System.out.println(k*3/s);
                break;
            }
        }
    }
}
