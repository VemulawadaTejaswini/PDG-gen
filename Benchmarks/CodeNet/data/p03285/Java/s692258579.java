import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //kosuu
        for(int i=0; 4*i<n; i++){
            for(int j=0; 7*j<n; i++){
               int sum =  4*i + 7*j;
               if(sum == n){
                   System.out.println("Yes");
                   return;
               } 
            }
        }
        System.out.println("No");
    }
}
