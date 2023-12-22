import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int l=s.length();
        int ans=1;
        for(int i=0;i<l;i++){
            char S=s.charAt(i);
            char T=t.charAt(i);
            if(S!=T){
                ans=0;
                break;
            }
        }
        if(ans==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
        System.out.println();
    }
}