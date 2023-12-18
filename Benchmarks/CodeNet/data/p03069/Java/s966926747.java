import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String in=sc.next();
        String []s=in.split("",0);
        String ss="";
        int count=0;
        for(int i=0;i<n;i++){
            if(!s[i].equals("#")){
                count++;
            }
        }
        int countmin=count;
        for(int i=0;i<n;i++){
            if(!s[i].equals("#"))
                count--;
            else count++;
            countmin=Math.min(count,countmin);
        }
        System.out.println(countmin);
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
