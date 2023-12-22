import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int C_0 = 0;
        int C_1 = 0;
        int C_2 = 0;
        int C_3 = 0;
        String s[] = new String[N]; 
        
        for(int i=0; i<N; i++){
            
            s[i] = scanner.next();
            
            if(s[i].equals("AC")){
                C_0 += 1;
            }else if(s[i].equals("WA")){
                C_1 += 1;
            }else if(s[i].equals("TLE")){
                C_2 += 1;
            }else{
                C_3 += 1;
            }
        }
        
        System.out.print("AC × ");
        System.out.println(C_0);
        
        System.out.print("WA × ");
        System.out.println(C_1);
        
        System.out.print("TLE × ");
        System.out.println(C_2);
        
        System.out.print("RE × ");
        System.out.println(C_3);

    }
}
