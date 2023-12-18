import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int output=0;
        for(int i=0;i<n;i++){
            output+=1-sc.nextInt()+sc.nextInt();
        }
        System.out.println(output);
    }
 
    
}