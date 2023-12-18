import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        k--;
    //    int f[] = new int[k];
   String s = sc.next();
         
       char c[] = s.toCharArray();
      s = s.toLowerCase();
     char d []  = s.toCharArray();
       
        for(int i=0 ; i<n ; i++){
       if(i==k)
       {
           c[i] = d[k];
           break ;
       }
        
    }   for(int i = 0 ; i <c.length ; i++)
        System.out.print(c[i]);
} 
}
