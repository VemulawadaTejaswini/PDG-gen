import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int l=s.length();
        boolean ans=true;
        for(int i=0;i<l;i++){
            char S=s.charAt(i);
            char T=t.charAt(i);
            if(S!=T){
                ans=false;
                break;
            }
        }
        if(ans){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
        System.out.println();
    }
}