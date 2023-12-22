import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result[] = new String[n];
        
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        
        for(int i=0;i<n;i++){
            result[i] = sc.next();
        }
        for(int j=0;j<n;j++){
            if(result[j].equals("AC")){
                c0++;
            }else if(result[j].equals("WA")){
                c1++;
            }else if(result[j].equals("TLE")){
                c2++;
            }else if(result[j].equals("RE")){
                c3++;
            }else{
                return;
            }
        }
        System.out.println("AC × " + c0 );
        System.out.println("WA × " + c1 );
        System.out.println("TLE × " + c2 );
        System.out.println("RE × " + c3 );
    }
}
