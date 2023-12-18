import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=Long.parseLong(sc.next());
        int ans=0;
        for(int i=1;i*i<n;i++){
            if(((long)Math.sqrt(n+i*i))*((long)Math.sqrt(n+i*i))==n+i*i){
                ans=i;
                break;
            }
        }
        long po=(long)Math.sqrt(n+ans*ans);
        System.out.println("0 0 "+"0 "+(po-ans)+" "+(po+ans)+" 0");
    }
}
