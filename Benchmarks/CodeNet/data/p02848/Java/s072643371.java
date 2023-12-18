import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s;
       int n;
       n=in.nextInt();
       
       s=in.nextLine();
       int b;
       b=(s.length());
        char ar[]=new char[15];
        s.getChars(0,b,ar,0);
        for (int i = 0; i <s.length(); i++) {
            if(ar[i]=='Z'){
                ar[i]=64;
            }
            if(ar[i]=='Y'){
                ar[i]=63;
            }
            for (int j = 0; j < n; j++) {
                ar[i]++;
            }
            System.out.print(ar[i]);
        }
        System.out.println("");
        
        
        
    }
    
}