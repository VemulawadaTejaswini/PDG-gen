import java.util.*;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        String s = stdIn.next();
        char c[] = s.toCharArray();
        
        int quo = (s.length() - 1) / 2;
        
        String s1 = s.substring(0, quo);
        char c1[] = s1.toCharArray();
        
        //System.out.println(s1);//
        
        String s2 = s.substring((s.length() + 3) / 2 - 1, s.length());
        char c2[] = s2.toCharArray();
        
        //System.out.println(s2);//
        
        boolean flag = true;
        
        if(flag){
            for(int i = 0; i < s.length() / 2; i++){
                if(c[i] != c[s.length() - 1 - i]){
                    flag = false;
                    break;
                }
            }
        }
        
        //System.out.println(flag);//
        
        if(flag){
            for(int i = 0; i < s1.length() / 2; i++){
                if(c1[i] != c1[s1.length() - 1 - i]){
                    flag = false;
                    break;
                }
            }
        }
        
        //System.out.println(flag);//
        
        if(flag){
            for(int i = 0; i < s2.length() / 2; i++){
                if(c2[i] != c2[s2.length() - 1 - i]){
                    flag = false;
                    break;
                }
            }
        }
        
        

        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        
        
        
        
        // for(int i = 0; i < s.length(); i++){
        //     a[i] = c[i] - 48;
        //     System.out.println(a[i]);
        // }
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}