
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=0;i<=3;i++){
            for(int j=0;j<=4;j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
