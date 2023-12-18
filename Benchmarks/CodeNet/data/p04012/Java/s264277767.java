import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        //char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] c = new char[s.length()];
        //int[] n = new int[26];
        
        
        if(s.length()%2==1){
            System.out.println("No");
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
        }
        
        Arrays.sort(c);
        
        
        int a=1;
        for(int i=1; i<s.length(); i++){
            if(c[i-1]==c[i]){
                a++;
            }else{
                if(a%2==1){
                    //System.out.println(c[i]);
                    System.out.println("No");
                    return;
                }
                a=1;
            }
            //System.out.print(c[i]);
            //System.out.println(a);
        }
        
        System.out.println("Yes");
   }
}
