import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        int x = l;
        String[] a = {"dream", "dreamer", "erase", "eraser"};

        for(int i=l-1; i>=0; i--){
            if(x==l){
                for(int j=0; j<4; j++){
                    if(S.substring(i).equals(a[j])){
                        x = i;
                    }
                }
            }
            else{
                for(int j=0; j<4; j++){
                    if(S.substring(i, x).equals(a[j])){
                        x = i;
                    }
                }
            }
        }
        if(x==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}