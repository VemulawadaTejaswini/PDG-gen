import java.util.*;
 
public class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a[] = new int[120];
 
        for(int i=0;i<b;i++){
             a[i] = sc.nextInt();
        }
 
        //System.out.println(a[3]);
 
        Arrays.sort(a);
 
 
 
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
 
        int d = b-1;
 
 
        //System.out.println(sum);
 
        if(a[d]<=sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
 
 
    
 
 
 
    }
}