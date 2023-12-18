import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        int sum = 0;
        int i;
        int n = k;
      
        for(i=1;i<=k;i++){
            if(a!=0){
                sum+=1;
                a--;
                n--;              
            }
            else if(b!=0){
                b--;
                n--;
            }
            else if(c!=0){
                sum-=1;
                c--;
                n--;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}