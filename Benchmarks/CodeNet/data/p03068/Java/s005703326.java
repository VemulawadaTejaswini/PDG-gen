import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k=sc.nextInt();
        String po=s.substring(k-1,k);
        for(int i=0;i<n;i++){
            if(s.substring(i,i+1).equals(po))System.out.print(s.substring(i,i+1));
            else System.out.print("*");
        }
        System.out.println();
    }
    
 
}class Po{
    int a,b;
    public Po(int a,int b){
        this.a=a;
        this.b=b;
    }
    public String toString(){
        return a+" "+b;
    }
}
