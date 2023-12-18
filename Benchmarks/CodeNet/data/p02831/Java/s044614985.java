import java.util.*;


public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 1;        
        int d = 1;

        while(a!=b){
            if(a*c > b*d){
                d++;
            }else if(a*c < b*d){
                c++;
            }else{
              break;
            }
        }
        System.out.println(a*c);
    }
}